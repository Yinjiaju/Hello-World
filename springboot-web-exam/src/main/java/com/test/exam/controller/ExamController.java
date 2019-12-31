package com.test.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author yinjiaju
 *
 */

@Controller
@RequestMapping("exam")  //@RequestMapping("/exam")  @RequestMapping(value="/exam")
public class ExamController {
    private final static Logger logger = LoggerFactory.getLogger(ExamController.class);
    
   
    @RequestMapping("/login")
    public String login(ModelMap map) {
        map.put("title", "你好");
        return "login";
    }
    @RequestMapping("/mlogin")
    public ModelAndView mlogin(){
        ModelAndView view = new ModelAndView("login");
        return view;
    }
    
    
    
}
