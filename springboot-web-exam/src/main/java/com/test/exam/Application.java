package com.test.exam;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

import com.test.exam.controller.ExamController;

/**
 * Spring Boot应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
@SpringBootApplication  //Spring Boot 应用的标识  
public class Application {
    private final static Logger logger = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        logger.info("===========spring boot start=================");
    }
    
}
