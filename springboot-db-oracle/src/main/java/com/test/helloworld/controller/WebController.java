package com.test.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    
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
