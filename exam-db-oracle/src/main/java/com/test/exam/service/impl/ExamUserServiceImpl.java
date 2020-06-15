package com.test.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
import com.test.exam.service.ExamService;
import com.test.exam.service.ExamUserService;

@Service(version = "examUserService")
// 属于Dubbo的@Service注解，非Spring 作用：暴露服务
@Component
public class ExamUserServiceImpl implements ExamUserService {

    @Autowired
    private ExamUserDao examUserDao;

    @Override
    public Integer insertExamUser(ExamUser examUser) throws Exception {
        // TODO Auto-generated method stub
        return examUserDao.insert(examUser);
    }

    @Override
    public Integer insertExamUserList(List<ExamUser> examUsers) throws Exception {
        // TODO Auto-generated method stub
        return examUserDao.insertList(examUsers);
    }

    @Override
    public Integer updateExamUser(ExamUser examUser) throws Exception {
        // TODO Auto-generated method stub
        return examUserDao.update(examUser);
    }

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public Integer updateExamUserList(List<ExamUser> examUsers) throws Exception {
        // TODO Auto-generated method stub
        Integer num = 0;
        for (ExamUser examUser : examUsers) {
            examUserDao.update(examUser);
            num++;
        }
        return num;
    }

    @Override
    public Integer getExamUserIDSEQ() throws Exception {
        // TODO Auto-generated method stub
        return examUserDao.getExamUserSEQ();
    }

    @Override
    public ExamUser getExamUser(ExamUser examUser) throws Exception {
        return examUserDao.get(examUser);
    }

    @Override
    public List<ExamUser> getExamUserList(ExamUser examUser) throws Exception {
        // TODO Auto-generated method stub
        return examUserDao.getList(examUser);
    }

}
