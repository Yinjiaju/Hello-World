package com.test.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exam.domain.UIResult;

@RestController  //实现 Restful HTTP 服务
public class UIExamResultsDetailsController {

	
	@RequestMapping(value="/examResultsDetails/insertExamResultsDetails")
    public UIResult insertExamResultsDetails(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examResultsDetails/insertExamResultsDetailsList")
    public UIResult insertExamResultsDetailsList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examResultsDetails/updateExamResultsDetails")
    public UIResult updateExamResultsDetails(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examResultsDetails/updateExamResultsDetailsList")
    public UIResult updateExamResultsDetailsList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examResultsDetails/getExamResultsDetails")
    public UIResult getExamResultsDetails(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }
	@RequestMapping(value="/examResultsDetails/getExamResultsDetailsList")
    public UIResult getExamResultsDetailsList(
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        return uiResult;
    }


}
