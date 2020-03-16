package com.test.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exam.domain.UIResult;

@RestController  //实现 Restful HTTP 服务
public class UIExamUserController {

	
	@RequestMapping(value="/examUser/insertExamUser")
    public UIResult insertExamUser(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examUser/insertExamUserList")
    public UIResult insertExamUserList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examUser/updateExamUser")
    public UIResult updateExamUser(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examUser/updateExamUserList")
    public UIResult updateExamUserList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examUser/getExamMenusDetailIDSEQ")
    public UIResult getExamMenusDetailIDSEQ(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examUser/getExamUserIDSEQ")
    public UIResult getExamUserIDSEQ(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examUser/getExamUser")
    public UIResult getExamUser(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examUser/getExamUserList")
    public UIResult getExamUserList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }



}
