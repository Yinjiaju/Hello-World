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
import com.test.exam.service.ExamTitleService;

@Service(version="examTitleService")   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class ExamTitleServiceImpl implements ExamTitleService{
	
	@Autowired
	private ExamTitleDao examTitleDao;

	@Override
	public Integer insertExamTitle(ExamTitle examTitle) throws Exception {
		// TODO Auto-generated method stub
		return examTitleDao.insert(examTitle);
	}

	@Override
	public Integer insertExamTitleList(List<ExamTitle> examTitles)
			throws Exception {
		// TODO Auto-generated method stub
		return examTitleDao.insertList(examTitles);
	}

	@Override
	public Integer updateExamTitle(ExamTitle examTitle) throws Exception {
		// TODO Auto-generated method stub
		return examTitleDao.update(examTitle);
	}
	
	@Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamTitleList(List<ExamTitle> examTitles)
			throws Exception {
		// TODO Auto-generated method stub
		Integer num = 0;
		for (ExamTitle examTitle : examTitles) {
			examTitleDao.update(examTitle);
			num++;
		}
		return num;
	}
	
	@Override
	public Integer getExamTitleIDSEQ() throws Exception {
		// TODO Auto-generated method stub
		return examTitleDao.getExamTitleSEQ();
	}

	@Override
	public ExamTitle getExamTitle(ExamTitle examTitle) throws Exception {
		// TODO Auto-generated method stub
		return examTitleDao.get(examTitle);
	}

	@Override
	public List<ExamTitle> getExamTitleList(ExamTitle examTitle)
			throws Exception {
		// TODO Auto-generated method stub
		return examTitleDao.getList(examTitle);
	}
	
	
}
