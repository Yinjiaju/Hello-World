package com.test.exam;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

import org.slf4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.test.exam.utils.LogUtil;
import com.test.tailong.app.TailongApplicationConfig;

/**
 * BeanDefinitionRegistryPostProcessor 的启动顺序
 * @author Administrator
 *
 */
@Component
public class ApplicationBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor,ApplicationContextAware {
	private static Logger logger = LogUtil.getLogger(ApplicationBeanDefinitionRegistryPostProcessor.class);
	
	private final static String FILE_FACTORY = "exam.factories";
	private final static String CLASS_NAME = TailongApplicationConfig.class.getName();
	
	private ApplicationContext context;
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		Properties properties = getProperties(getClass().getClassLoader(),FILE_FACTORY);
		// from jvm params  -DTAILLONG.FLAG=true
		String property = context.getEnvironment().getProperty("TAILONG.FLAG","false");
		if("true".equalsIgnoreCase(property)) {
			String dispatchValue = properties.getProperty(CLASS_NAME);
			if(StringUtils.hasText(dispatchValue)) {
				try {
					Class clazz = getClass().getClassLoader().loadClass(dispatchValue);
					GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
					beanDefinition.setBeanClass(clazz);
					if(!registry.containsBeanDefinition(clazz.getSimpleName())) {
						registry.registerBeanDefinition(clazz.getSimpleName(), beanDefinition);
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private Properties getProperties(ClassLoader classLoader, String fileFactory) {
		Properties properties = new Properties();
		try {
			Enumeration<URL> resources = classLoader.getResources(fileFactory);
			while (resources.hasMoreElements()) {
				URL url = resources.nextElement();
				properties.putAll(PropertiesLoaderUtils.loadProperties(new UrlResource(url)));
				
			}
		} catch (IOException e) {
			
		}
		return properties;
	}

}
