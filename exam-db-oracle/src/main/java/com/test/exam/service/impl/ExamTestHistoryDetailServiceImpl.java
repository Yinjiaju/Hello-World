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
import com.test.exam.service.ExamTestHistoryDetailService;

@Service(version="examTestHistoryDetailService")   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class ExamTestHistoryDetailServiceImpl implements ExamTestHistoryDetailService{
	
	@Autowired
	private ExamTestHistoryDetailDao examTestHistoryDetailDao;

	@Override
	public Integer insertExamTestHistoryDetail(
			ExamTestHistoryDetail examTestHistoryDetail) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDetailDao.insert(examTestHistoryDetail);
	}

	@Override
	public Integer insertExamTestHistoryDetailList(
			List<ExamTestHistoryDetail> examTestHistoryDetails)
			throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDetailDao.insertList(examTestHistoryDetails);
	}

	@Override
	public Integer updateExamTestHistoryDetail(
			ExamTestHistoryDetail examTestHistoryDetail) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDetailDao.update(examTestHistoryDetail);
	}
	
	@Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamTestHistoryDetailList(
			List<ExamTestHistoryDetail> examTestHistoryDetails)
			throws Exception {
		// TODO Auto-generated method stub
		Integer num = 0;
		for (ExamTestHistoryDetail examTestHistoryDetail : examTestHistoryDetails) {
			examTestHistoryDetailDao.update(examTestHistoryDetail);
			num++;
		}
		return num;
	}

	@Override
	public ExamTestHistoryDetail getExamTestHistoryDetail(
			ExamTestHistoryDetail examTestHistoryDetail) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDetailDao.get(examTestHistoryDetail);
	}

	@Override
	public List<ExamTestHistoryDetail> getExamTestHistoryDetailList(
			ExamTestHistoryDetail examTestHistoryDetail) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDetailDao.getList(examTestHistoryDetail);
	}
	
	

}
