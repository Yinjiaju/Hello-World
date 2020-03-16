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
import com.test.exam.service.ExamService;

@Service(version="examService")   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class ExamTestHistoryDetailServiceImpl implements ExamService{
	
	@Autowired
	private ExamUserDao examUserDao;
	
	@Autowired
	private ExamMenusDao examMenusDao;
	
	@Autowired
	private ExamMenusDetailDao examMenusDetailDao;
	
	@Autowired
	private ExamTitleDao examTitleDao;
	
	@Autowired
	private ExamResultsDetailsDao examResultsDetailsDao;
	
	@Autowired
	private ExamTestHistoryDao examTestHistoryDao;
	
	@Autowired
	private ExamTestHistoryDetailDao examTestHistoryDetailDao;
	
	
	@Override
	public Integer insertExamUser(ExamUser examUser) throws Exception {
		return examUserDao.insert(examUser);
	}

	@Override
	public Integer insertExamUserList(List<ExamUser> examUsers)
			throws Exception {
		return examUserDao.insertList(examUsers);
	}

	@Override
	public Integer updateExamUser(ExamUser examUser) throws Exception {
		return examUserDao.update(examUser);
	}

	@Override
	public Integer updateExamUserList(List<ExamUser> examUsers)
			throws Exception {
		return examUserDao.updateList(examUsers);
	}

	@Override
	public Integer insertExamMenus(ExamMenus examMenu) throws Exception {
		return examMenusDao.insert(examMenu);
	}

	@Override
	public Integer insertExamMenusList(List<ExamMenus> examMenus)
			throws Exception {
		return examMenusDao.insertList(examMenus);
	}

	@Override
	public Integer updateExamMenus(ExamMenus examMenu) throws Exception {
		return examMenusDao.update(examMenu);
	}

	@Override
	public Integer updateExamMenusList(List<ExamMenus> examMenus)
			throws Exception {
		// TODO Auto-generated method stub
		return examMenusDao.updateList(examMenus);
	}

	@Override
	public Integer insertExamMenusDetail(ExamMenusDetail examMenuDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return examMenusDetailDao.insert(examMenuDetail);
	}

	@Override
	public Integer insertExamMenusDetailList(
			List<ExamMenusDetail> examMenuDetails) throws Exception {
		// TODO Auto-generated method stub
		return examMenusDetailDao.insertList(examMenuDetails);
	}

	@Override
	public Integer updateExamMenusDetail(ExamMenusDetail examMenuDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return examMenusDetailDao.update(examMenuDetail);
	}

	@Override
	public Integer updateExamMenusDetailList(
			List<ExamMenusDetail> examMenuDetails) throws Exception {
		// TODO Auto-generated method stub
		return examMenusDetailDao.updateList(examMenuDetails);
	}

	@Override
	public Integer insertExamTitle(ExamTitle examTitle) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertExamTitleList(List<ExamTitle> examTitles)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateExamTitle(ExamTitle examTitle) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateExamTitleList(List<ExamTitle> examTitles)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertExamResultsDetails(ExamResultsDetails examResultsDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertExamResultsDetailsList(
			List<ExamResultsDetails> examResultsDetails) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateExamResultsDetails(ExamResultsDetails examResultsDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateExamResultsDetailsList(
			List<ExamResultsDetails> examResultsDetails) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertExamTestHistory(ExamTestHistory examTestHistory)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertExamTestHistoryList(
			List<ExamTestHistory> examTestHistorys) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateExamTestHistory(ExamTestHistory examTestHistory)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateExamTestHistoryList(
			List<ExamTestHistory> examTestHistorys) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertExamTestHistoryDetail(
			ExamTestHistoryDetail examTestHistoryDetail) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertExamTestHistoryDetailList(
			List<ExamTestHistoryDetail> examTestHistoryDetails)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateExamTestHistoryDetail(
			ExamTestHistoryDetail examTestHistoryDetail) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateExamTestHistoryDetailList(
			List<ExamTestHistoryDetail> examTestHistoryDetails)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getExamUserIDSEQ() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getExamMenusIDSEQ() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getExamMenusDetailIDSEQ() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getExamTitleIDSEQ() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
