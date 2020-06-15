package com.test.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.exam.domain.ExamUser;
import com.test.exam.domain.UIResult;
import com.test.exam.service.UIExamUserService;
import com.test.exam.utils.Md5Util;

@RestController
// 实现 Restful HTTP 服务
public class AdminController {
    Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private UIExamUserService uiexamUserService;

    @RequestMapping(value = "/user/login")
    public UIResult loginUsers(@RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password, HttpServletRequest request) {
        UIResult ui = new UIResult();
        ExamUser user = new ExamUser();
        user.setUserName(username);
        StringBuffer errMsg = new StringBuffer();
        boolean isSucc = true;
        try {
            user = uiexamUserService.getExamUser(user);
        } catch (Exception e) {
            isSucc = false;
            log.error(e.toString());
            errMsg.append("查询用户失败，请联系管理员");
        }
        if (user == null) {
             errMsg.append("该用户不存在");
             isSucc = false;
        }else{
             if(!Md5Util.getMD5(password).equalsIgnoreCase(user.getPassword())){
                 errMsg.append("密码不正确");
                 isSucc = false;
             }
        }
        if (isSucc) {
            request.getSession().setAttribute("EXAMUSER", user);
            ui.setResult("SUCCESS");
            return ui;
        } else {
            ui.setResult("ERROR");
            ui.setMessage(errMsg.toString());
            return ui;
        }
    }
    
    @RequestMapping(value = "/user/loginOut")
    public ModelAndView loginOut(HttpServletRequest request){
        ModelAndView view = new ModelAndView("login");
        request.getSession().removeAttribute("EXAMUSER");
        return view;
    }
    
    
    
    
}
