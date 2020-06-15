package com.test.exam.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.exam.domain.ExamUser;
import com.test.exam.util.UIConstants;
import com.test.exam.utils.LogUtil;
import com.test.exam.utils.Md5Util;

/**
 * 主页面
 * @author Administrator
 *
 */
@RestController
public class HomeController {
    
    private static Logger logger = LogUtil.getLogger(HomeController.class);
    
    @RequestMapping(value="/home/show")
    public ModelAndView showHome(HttpServletRequest request,HttpServletResponse response){
        ModelAndView view = new ModelAndView("home");
        ExamUser user = (ExamUser) request.getSession().getAttribute("EXAMUSER");
        view.addObject(UIConstants.USER_NAME,user.getUserName());
        return view;
    }
    //e10adc3949ba59abbe56e057f20f883e
    public static void main(String[] args) {
        System.err.println(Md5Util.getMD5("123456"));
    }
}
