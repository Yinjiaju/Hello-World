package com.test.exam.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.test.exam.domain.ExamResultsDetails;
import com.test.exam.service.ExamResultsDetailsService;
import com.test.exam.service.UIExamResultsDetailsService;

@Service
@Component
public class UIExamResultsDetailsServiceImpl implements UIExamResultsDetailsService{
	
	
	@Reference(timeout=1800000,version="examResultsDetailsService",check=false)
    private ExamResultsDetailsService examResultsDetailsService;
	
	
	@Override
	public Integer insertExamResultsDetails(ExamResultsDetails examResultsDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return examResultsDetailsService.insertExamResultsDetails(examResultsDetail);
	}

	@Override
	public Integer insertExamResultsDetailsList(
			List<ExamResultsDetails> examResultsDetails) throws Exception {
		// TODO Auto-generated method stub
		return examResultsDetailsService.insertExamResultsDetailsList(examResultsDetails);
	}

	@Override
	public Integer updateExamResultsDetails(ExamResultsDetails examResultsDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return examResultsDetailsService.updateExamResultsDetails(examResultsDetail);
	}

	@Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamResultsDetailsList(
			List<ExamResultsDetails> examResultsDetails) throws Exception {
		
		return examResultsDetailsService.updateExamResultsDetailsList(examResultsDetails);
	}

	@Override
	public ExamResultsDetails getExamResultsDetails(ExamResultsDetails examResultsDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return examResultsDetailsService.getExamResultsDetails(examResultsDetail);
	}

	@Override
	public List<ExamResultsDetails> getExamResultsDetailsList(
			ExamResultsDetails examResultsDetail) throws Exception {
		// TODO Auto-generated method stub
		return examResultsDetailsService.getExamResultsDetailsList(examResultsDetail);
	}
	
	

}
