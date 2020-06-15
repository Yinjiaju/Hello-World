package com.test.exam.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exam.domain.ExamMenus;
import com.test.exam.domain.UIResult;
import com.test.exam.service.UIExamMenusService;
import com.test.exam.utils.dateUtil;

@RestController
// 实现 Restful HTTP 服务
public class UIExamMenusController {
    
    @Autowired
    private UIExamMenusService uiExamMenusService;
    
    @RequestMapping(value = "/examMenus/insertExamMenus")
    public UIResult insertExamMenus(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        
        List<ExamMenus> ls = getExamsTestDemo();
        for (ExamMenus examMenus : ls) {
            uiExamMenusService.insertExamMenus(examMenus);
        }
        return uiResult;
    }

    @RequestMapping(value = "/examMenus/insertExamMenusList")
    public UIResult insertExamMenusList(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        List<ExamMenus> ls = getExamsTestDemo();
        uiExamMenusService.insertExamMenusList(ls);
        return uiResult;
    }

    @RequestMapping(value = "/examMenus/updateExamMenus")
    public UIResult updateExamMenus(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examMenus/updateExamMenusList")
    public UIResult updateExamMenusList(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examMenus/getExamMenusIDSEQ")
    public UIResult getExamMenusIDSEQ(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examMenus/getExamMenus")
    public UIResult getExamMenus(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examMenus/getExamMenusList")
    public UIResult getExamMenusList(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }
    
    public List<ExamMenus> getExamsTestDemo () throws Exception{
        List<ExamMenus> ls = new ArrayList<ExamMenus>();
        for (int i = 0; i < 3; i++) {
            ExamMenus e1 = new ExamMenus(uiExamMenusService.getExamMenusIDSEQ(), "1", "admin", dateUtil.format(new Date()), "admin", dateUtil.format(new Date()), "A");
            ls.add(e1);
        }
        return ls ;
    }
    
}
