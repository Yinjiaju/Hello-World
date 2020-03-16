package com.test.exam.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.test.exam.domain.ExamMenus;
import com.test.exam.service.ExamMenusService;
import com.test.exam.service.UIExamMenusService;

@Service
@Component
public class UIExamMenusServiceImpl implements UIExamMenusService{
	

	@Reference(timeout=1800000,version="examMenusService",check=false)
    private ExamMenusService examMenusService;

	@Override
	public Integer insertExamMenus(ExamMenus examMenu) throws Exception {
		// TODO Auto-generated method stub
		return examMenusService.insertExamMenus(examMenu);
	}

	@Override
	public Integer insertExamMenusList(List<ExamMenus> examMenus)
			throws Exception {
		// TODO Auto-generated method stub
		return examMenusService.insertExamMenusList(examMenus);
	}

	@Override
	public Integer updateExamMenus(ExamMenus examMenu) throws Exception {
		// TODO Auto-generated method stub
		return examMenusService.updateExamMenus(examMenu);
	}

	
    @Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamMenusList(List<ExamMenus> examMenus)
			throws Exception {
		
		return examMenusService.updateExamMenusList(examMenus);
	}

	@Override
	public Integer getExamMenusIDSEQ() throws Exception {
		// TODO Auto-generated method stub
		return examMenusService.getExamMenusIDSEQ();
	}

	@Override
	public ExamMenus getExamMenus(ExamMenus examMenus) throws Exception {
		// TODO Auto-generated method stub
		return examMenusService.getExamMenus(examMenus);
	}

	@Override
	public List<ExamMenus> getExamMenusList(ExamMenus examMenus)
			throws Exception {
		// TODO Auto-generated method stub
		return examMenusService.getExamMenusList(examMenus);
	}
	
	
	

}
