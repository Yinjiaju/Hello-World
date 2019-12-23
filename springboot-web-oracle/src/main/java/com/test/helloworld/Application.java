package com.test.helloworld;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

import com.test.helloworld.config.Devproperties;

/**
 * Spring Boot应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
@SpringBootApplication(scanBasePackages = {"com.test"})  //Spring Boot 应用的标识
@MapperScan("com.test.helloworld.dao")//mapper 接口类扫描包配置
@ImportResource("applicationContext.xml")
//@ComponentScan(basePackages = "com.test.helloworld.*,com.test.helloworld.service.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    
}
