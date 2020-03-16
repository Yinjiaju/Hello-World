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
import com.test.exam.service.ExamResultsDetailsService;
import com.test.exam.service.ExamService;

@Service(version="examResultsDetailsService")   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class ExamResultsDetailsServiceImpl implements ExamResultsDetailsService{
	
	@Autowired
	private ExamResultsDetailsDao examResultsDetailsDao;

	@Override
	public Integer insertExamResultsDetails(ExamResultsDetails examResultsDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return examResultsDetailsDao.insert(examResultsDetail);
	}

	@Override
	public Integer insertExamResultsDetailsList(
			List<ExamResultsDetails> examResultsDetails) throws Exception {
		// TODO Auto-generated method stub
		return examResultsDetailsDao.insertList(examResultsDetails);
	}

	@Override
	public Integer updateExamResultsDetails(ExamResultsDetails examResultsDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return examResultsDetailsDao.update(examResultsDetail);
	}

	@Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamResultsDetailsList(
			List<ExamResultsDetails> examResultsDetails) throws Exception {
		// TODO Auto-generated method stub
		Integer num = 0;
		for (ExamResultsDetails examResultsDetails2 : examResultsDetails) {
			examResultsDetailsDao.update(examResultsDetails2);
			num++;
		}
		
		return num;
	}

	@Override
	public ExamResultsDetails getExamResultsDetails(ExamResultsDetails examResultsDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return examResultsDetailsDao.get(examResultsDetail);
	}

	@Override
	public List<ExamResultsDetails> getExamResultsDetailsList(
			ExamResultsDetails examResultsDetail) throws Exception {
		// TODO Auto-generated method stub
		return examResultsDetailsDao.getList(examResultsDetail);
	}
	
	

}
