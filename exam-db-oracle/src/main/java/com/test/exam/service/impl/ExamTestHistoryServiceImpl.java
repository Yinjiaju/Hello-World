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
import com.test.exam.service.ExamTestHistoryService;

@Service(version="examTestHistoryService")   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class ExamTestHistoryServiceImpl implements ExamTestHistoryService{
	
	
	@Autowired
	private ExamTestHistoryDao examTestHistoryDao;

	@Override
	public Integer insertExamTestHistory(ExamTestHistory examTestHistory)
			throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDao.insert(examTestHistory);
	}

	@Override
	public Integer insertExamTestHistoryList(
			List<ExamTestHistory> examTestHistorys) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDao.insertList(examTestHistorys);
	}

	@Override
	public Integer updateExamTestHistory(ExamTestHistory examTestHistory)
			throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDao.update(examTestHistory);
	}
	
	@Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamTestHistoryList(
			List<ExamTestHistory> examTestHistorys) throws Exception {
		// TODO Auto-generated method stub
		Integer num = 0;
		for (ExamTestHistory examTestHistory : examTestHistorys) {
			examTestHistoryDao.update(examTestHistory);
			num++;
		}
		return num;
	}

	@Override
	public ExamTestHistory getExamTestHistory(ExamTestHistory examTestHistory)
			throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDao.get(examTestHistory);
	}

	@Override
	public List<ExamTestHistory> getExamTestHistoryList(
			ExamTestHistory examTestHistory) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDao.getList(examTestHistory);
	}
	
	
}
