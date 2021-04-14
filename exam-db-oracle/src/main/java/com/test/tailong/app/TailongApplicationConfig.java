package com.test.tailong.app;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class TailongApplicationConfig implements BeanDefinitionRegistryPostProcessor,ApplicationContextAware{
	private static final String TAILONG_BASE_PACKAGE = "com.test.tailong";
	private ApplicationContext context;
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context=applicationContext;
	}
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		TailongScanner scanner = new TailongScanner(registry);
		scanner.setResourceLoader(context);
		scanner.scan(TAILONG_BASE_PACKAGE);
	}
	
	final class TailongScanner extends ClassPathBeanDefinitionScanner{

		public TailongScanner(BeanDefinitionRegistry registry) {
			super(registry);
		}
	}
	
}
