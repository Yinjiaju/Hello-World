package com.test.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.exam.dao.ExamMenusDao;
import com.test.exam.dao.ExamMenusDetailDao;
import com.test.exam.dao.ExamResultsDetailsDao;
import com.test.exam.dao.ExamTestHistoryDao;
import com.test.exam.dao.ExamTestHistoryDetailDao;
import com.test.exam.dao.ExamTitleDao;
import com.test.exam.dao.ExamUserDao;
import com.test.exam.domain.ExamMenus;
import com.test.exam.domain.ExamMenusDetail;
import com.test.exam.domain.ExamResultsDetails;
import com.test.exam.domain.ExamTestHistory;
import com.test.exam.domain.ExamTestHistoryDetail;
import com.test.exam.domain.ExamTitle;
import com.test.exam.domain.ExamUser;
import com.test.exam.service.ExamMenusDetailService;
import com.test.exam.service.ExamService;

@Service(version="examMenusDetailService")   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class ExamMenusDetailServiceImpl implements ExamMenusDetailService{
	

    @Autowired
    private ExamMenusDetailDao examMenusDetailDao;

    @Override
    public Integer insertExamMenusDetail(ExamMenusDetail examMenuDetail) throws Exception {
        // TODO Auto-generated method stub
        return examMenusDetailDao.insert(examMenusDetail);
    }

    @Override
    public Integer insertExamMenusDetailList(List<ExamMenusDetail> examMenuDetails) throws Exception {
        // TODO Auto-generated method stub
        return examMenusDetailDao.insertList(examMenusDetails);
    }

    @Override
    public Integer updateExamMenusDetail(ExamMenusDetail examMenuDetail) throws Exception {
        // TODO Auto-generated method stub
        return examMenusDetailDao.update(examMenusDetail);
    }

    @Override
    public Integer updateExamMenusDetailList(List<ExamMenusDetail> examMenuDetails) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer getExamMenusDetailIDSEQ() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
	
	

}
