package com.test.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author yinjiaju
 *
 */

@Controller
public class HelloWebController {
    private final static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    
    @RequestMapping("/hello")
    public String hello(ModelMap map) {
        map.put("title", "你好");
        return "index";
    }
    
    @RequestMapping("/hello1")
    public String hello1(ModelMap map) {
        map.put("title", "你好");
        return "hello";
    }

}
