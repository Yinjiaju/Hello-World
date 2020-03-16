package com.test.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exam.domain.UIResult;
import com.test.exam.service.UIExamResultsDetailsService;
import com.test.exam.service.UIExamTestHistoryDetailService;

@RestController  //实现 Restful HTTP 服务
public class UIExamTestHistoryDetailController {

	@Autowired
	private UIExamTestHistoryDetailService uiExamTestHistoryDetailService;
	@RequestMapping(value="/examTestHistoryDetail/insertExamTestHistoryDetail")
    public UIResult insertExamTestHistoryDetail(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTestHistoryDetail/insertExamTestHistoryDetailList")
    public UIResult insertExamTestHistoryDetailList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTestHistoryDetail/updateExamTestHistoryDetail")
    public UIResult updateExamTestHistoryDetail(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTestHistoryDetail/updateExamTestHistoryDetailList")
    public UIResult updateExamTestHistoryDetailList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTestHistoryDetail/getExamTestHistoryDetail")
    public UIResult getExamTestHistoryDetail(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examTestHistoryDetail/getExamTestHistoryDetailList")
    public UIResult getExamTestHistoryDetailList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }




}
