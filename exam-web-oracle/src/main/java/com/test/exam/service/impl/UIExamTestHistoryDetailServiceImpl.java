package com.test.exam.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.test.exam.domain.ExamTestHistoryDetail;
import com.test.exam.service.ExamTestHistoryDetailService;
import com.test.exam.service.UIExamTestHistoryDetailService;

@Service
@Component
public class UIExamTestHistoryDetailServiceImpl implements UIExamTestHistoryDetailService{
	
	@Reference(timeout=1800000,version="examTestHistoryDetailService",check=false)
    private ExamTestHistoryDetailService examTestHistoryDetailService;

	@Override
	public Integer insertExamTestHistoryDetail(
			ExamTestHistoryDetail examTestHistoryDetail) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDetailService.insertExamTestHistoryDetail(examTestHistoryDetail);
	}

	@Override
	public Integer insertExamTestHistoryDetailList(
			List<ExamTestHistoryDetail> examTestHistoryDetails)
			throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDetailService.insertExamTestHistoryDetailList(examTestHistoryDetails);
	}

	@Override
	public Integer updateExamTestHistoryDetail(
			ExamTestHistoryDetail examTestHistoryDetail) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDetailService.updateExamTestHistoryDetail(examTestHistoryDetail);
	}
	
	@Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamTestHistoryDetailList(
			List<ExamTestHistoryDetail> examTestHistoryDetails)
			throws Exception {
	
		return examTestHistoryDetailService.updateExamTestHistoryDetailList(examTestHistoryDetails);
	}

	@Override
	public ExamTestHistoryDetail getExamTestHistoryDetail(
			ExamTestHistoryDetail examTestHistoryDetail) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDetailService.getExamTestHistoryDetail(examTestHistoryDetail);
	}

	@Override
	public List<ExamTestHistoryDetail> getExamTestHistoryDetailList(
			ExamTestHistoryDetail examTestHistoryDetail) throws Exception {
		// TODO Auto-generated method stub
		return examTestHistoryDetailService.getExamTestHistoryDetailList(examTestHistoryDetail);
	}
	
	

}
