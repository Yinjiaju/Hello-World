package com.test.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * Spring Boot应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
@SpringBootApplication  //Spring Boot 应用的标识
@MapperScan("com.test.exam.dao")//mapper 接口类扫描包配置
@EnableDubbo //注解开启dubbo 
//开启基于注解的dubbo功能（主要是包扫描@DubboComponentScan）
//也可以在配置文件中使用dubbo.scan.base-package来替代   @EnableDubbo
//读取resources目录下的applicationContext.xmlclasspath:
@ImportResource("applicationContext.xml")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    
}
