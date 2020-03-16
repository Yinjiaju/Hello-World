package com.test.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exam.domain.UIResult;

@RestController  //实现 Restful HTTP 服务
public class UIExamMenusController {
	
	@RequestMapping(value="/examMenus/insertExamMenus")
    public UIResult insertExamMenus(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenus/insertExamMenusList")
    public UIResult insertExamMenusList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenus/updateExamMenus")
    public UIResult updateExamMenus(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenus/updateExamMenusList")
    public UIResult updateExamMenusList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenus/getExamMenusIDSEQ")
    public UIResult getExamMenusIDSEQ(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenus/getExamMenus")
    public UIResult getExamMenus(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenus/getExamMenusList")
    public UIResult getExamMenusList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
}
