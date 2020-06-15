package com.test.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exam.domain.UIResult;
import com.test.exam.service.UIExamResultsDetailsService;
import com.test.exam.service.UIExamTestHistoryService;

@RestController
// 实现 Restful HTTP 服务
public class UIExamTestHistoryController {

    @Autowired
    private UIExamTestHistoryService uiExamTestHistoryService;

    @RequestMapping(value = "/examTestHistory/insertExamTestHistory")
    public UIResult insertExamTestHistory(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTestHistory/insertExamTestHistoryList")
    public UIResult insertExamTestHistoryList(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTestHistory/updateExamTestHistory")
    public UIResult updateExamTestHistory(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTestHistory/updateExamTestHistoryList")
    public UIResult updateExamTestHistoryList(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTestHistory/getExamTestHistory")
    public UIResult getExamTestHistory(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTestHistory/getExamTestHistoryList")
    public UIResult getExamTestHistoryList(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

}
