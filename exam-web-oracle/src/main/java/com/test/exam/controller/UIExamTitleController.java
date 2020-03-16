package com.test.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exam.domain.UIResult;
import com.test.exam.service.UIExamTitleService;

@RestController  //实现 Restful HTTP 服务
public class UIExamTitleController {

	@Autowired
	private UIExamTitleService uiExamTitleService;
	@RequestMapping(value="/examTitle/insertExamTitle")
    public UIResult insertExamTitle(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTitle/insertExamTitleList")
    public UIResult insertExamTitleList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTitle/updateExamTitle")
    public UIResult updateExamTitle(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTitle/updateExamTitleList")
    public UIResult updateExamTitleList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTitle/getExamTitleIDSEQ")
    public UIResult getExamTitleIDSEQ(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTitle/getExamTitle")
    public UIResult getExamTitle(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTitle/getExamTitleList")
    public UIResult getExamTitleList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }




}
