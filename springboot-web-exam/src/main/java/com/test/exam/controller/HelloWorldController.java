package com.test.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
* Spring Boot HelloWorld案例
*
* Created by bysocket on 16/4/26.
*/
@RestController  //@RestController：提供实现了REST API，可以服务JSON,XML或者其他。这里是以String的形式渲染出结果。
public class HelloWorldController {
    
   /*
    * 这种方式需要先注入配置文件
    * @Value("#{application-devproperties['home.test.province']}") 
   private String temp;*/
   
   @RequestMapping("/test") //@RequestMapping：提供路由信息，”/“路径的HTTP Request都会被映射到sayHello方法进行处理
   public String sayHello() {
       return "Hello,World!";
   }
   
   
   
}