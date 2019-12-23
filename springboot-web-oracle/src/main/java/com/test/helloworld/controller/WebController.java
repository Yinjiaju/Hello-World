package com.test.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.helloworld.service.MercuryUserService;

@Controller
public class WebController {
    @Autowired
    private MercuryUserService UserService;
    
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
