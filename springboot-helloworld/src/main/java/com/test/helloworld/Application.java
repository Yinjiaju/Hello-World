package com.test.helloworld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.helloworld.config.Devproperties;

/**
 * Spring Boot应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
@SpringBootApplication  //Spring Boot 应用的标识
@MapperScan("com.test.helloworld.dao")//mapper 接口类扫描包配置
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    
}
