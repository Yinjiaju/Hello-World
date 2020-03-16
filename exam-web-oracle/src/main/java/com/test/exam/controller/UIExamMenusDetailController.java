package com.test.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exam.domain.UIResult;

@RestController  //实现 Restful HTTP 服务
public class UIExamMenusDetailController {

	
	@RequestMapping(value="/examMenusDetail/insertExamMenusDetail")
    public UIResult insertExamMenusDetail(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenusDetail/insertExamMenusDetailList")
    public UIResult insertExamMenusDetailList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenusDetail/updateExamMenusDetail")
    public UIResult updateExamMenusDetail(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenusDetail/updateExamMenusDetailList")
    public UIResult updateExamMenusDetailList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenusDetail/getExamMenusDetailIDSEQ")
    public UIResult getExamMenusDetailIDSEQ(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenusDetail/getExamMenusDetail")
    public UIResult getExamMenusDetail(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examMenusDetail/getExamMenusDetailList")
    public UIResult getExamMenusDetailList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }


}
