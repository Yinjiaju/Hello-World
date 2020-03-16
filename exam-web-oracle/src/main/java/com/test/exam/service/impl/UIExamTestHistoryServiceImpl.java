package com.test.exam.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.test.exam.domain.ExamTestHistory;
import com.test.exam.service.ExamTestHistoryService;
import com.test.exam.service.UIExamTestHistoryService;

@Service
@Component
public class UIExamTestHistoryServiceImpl implements UIExamTestHistoryService{
	
	
	@Reference(timeout=1800000,version="examTestHistoryService",check=false)
    private ExamTestHistoryService examTestHistoryService;

	@Override
	public Integer insertExamTestHistory(ExamTestHistory examTestHistory)
			throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryService.insertExamTestHistory(examTestHistory);
	}

	@Override
	public Integer insertExamTestHistoryList(
			List<ExamTestHistory> examTestHistorys) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryService.insertExamTestHistoryList(examTestHistorys);
	}

	@Override
	public Integer updateExamTestHistory(ExamTestHistory examTestHistory)
			throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryService.updateExamTestHistory(examTestHistory);
				
	}
	
	@Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamTestHistoryList(
			List<ExamTestHistory> examTestHistorys) throws Exception {
		return examTestHistoryService.updateExamTestHistoryList(examTestHistorys);
	}

	@Override
	public ExamTestHistory getExamTestHistory(ExamTestHistory examTestHistory)
			throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryService.getExamTestHistory(examTestHistory);
	}

	@Override
	public List<ExamTestHistory> getExamTestHistoryList(
			ExamTestHistory examTestHistory) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryService.getExamTestHistoryList(examTestHistory);
	}
	
	
}
