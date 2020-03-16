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
import com.test.exam.service.ExamMenusService;
import com.test.exam.service.ExamService;

@Service(version="examMenusService")   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class ExamMenusServiceImpl implements ExamMenusService{
	

	@Autowired
	private ExamMenusDao examMenusDao;

	@Override
	public Integer insertExamMenus(ExamMenus examMenu) throws Exception {
		// TODO Auto-generated method stub
		return examMenusDao.insert(examMenu);
	}

	@Override
	public Integer insertExamMenusList(List<ExamMenus> examMenus)
			throws Exception {
		// TODO Auto-generated method stub
		return examMenusDao.insertList(examMenus);
	}

	@Override
	public Integer updateExamMenus(ExamMenus examMenu) throws Exception {
		// TODO Auto-generated method stub
		return examMenusDao.update(examMenu);
	}

	
    @Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamMenusList(List<ExamMenus> examMenus)
			throws Exception {
		// TODO Auto-generated method stub
    	Integer num = 0;
    	for (ExamMenus examMenus2 : examMenus) {
    		examMenusDao.update(examMenus2);
    		num++;
		}
		return num;
	}

	@Override
	public Integer getExamMenusIDSEQ() throws Exception {
		// TODO Auto-generated method stub
		return examMenusDao.getExamMenusSEQ();
	}

	@Override
	public ExamMenus getExamMenus(ExamMenus examMenus) throws Exception {
		// TODO Auto-generated method stub
		return examMenusDao.get(examMenus);
	}

	@Override
	public List<ExamMenus> getExamMenusList(ExamMenus examMenus)
			throws Exception {
		// TODO Auto-generated method stub
		return examMenusDao.getList(examMenus);
	}
	
	
	

}
