package com.test.exam.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.test.exam.domain.ExamTitle;
import com.test.exam.service.ExamTitleService;
import com.test.exam.service.UIExamTitleService;

@Service
@Component
public class UIExamTitleServiceImpl implements UIExamTitleService{
	
	@Reference(timeout=1800000,version="examTitleService",check=false)
    private ExamTitleService examTitleService;

	@Override
	public Integer insertExamTitle(ExamTitle examTitle) throws Exception {
		// TODO Auto-generated method stub
		return examTitleService.insertExamTitle(examTitle);
	}

	@Override
	public Integer insertExamTitleList(List<ExamTitle> examTitles)
			throws Exception {
		// TODO Auto-generated method stub
		return examTitleService.insertExamTitleList(examTitles);
	}

	@Override
	public Integer updateExamTitle(ExamTitle examTitle) throws Exception {
		// TODO Auto-generated method stub
		return examTitleService.updateExamTitle(examTitle);
	}
	
	@Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamTitleList(List<ExamTitle> examTitles)
			throws Exception {
		return examTitleService.updateExamTitleList(examTitles);
	}
	
	@Override
	public Integer getExamTitleIDSEQ() throws Exception {
		// TODO Auto-generated method stub
		return examTitleService.getExamTitleIDSEQ();
				
	}

	@Override
	public ExamTitle getExamTitle(ExamTitle examTitle) throws Exception {
		// TODO Auto-generated method stub
		return examTitleService.getExamTitle(examTitle);
	}

	@Override
	public List<ExamTitle> getExamTitleList(ExamTitle examTitle)
			throws Exception {
		// TODO Auto-generated method stub
		return examTitleService.getExamTitleList(examTitle);
	}
	
	
}
