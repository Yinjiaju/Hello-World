package com.test.exam.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.test.exam.domain.ExamUser;
import com.test.exam.service.ExamUserService;
import com.test.exam.service.UIExamUserService;

@Service
@Component
public class UIExamUserServiceImpl implements UIExamUserService{
	
	@Reference(timeout=1800000,version="examUserService",check=false)
    private ExamUserService examUserService;

	@Override
	public Integer insertExamUser(ExamUser examUser) throws Exception {
		// TODO Auto-generated method stub
		return examUserService.insertExamUser(examUser);
	}

	@Override
	public Integer insertExamUserList(List<ExamUser> examUsers)
			throws Exception {
		// TODO Auto-generated method stub
		return examUserService.insertExamUserList(examUsers);
	}

	@Override
	public Integer updateExamUser(ExamUser examUser) throws Exception {
		// TODO Auto-generated method stub
		return examUserService.updateExamUser(examUser);
	}
	
	@Transactional(rollbackFor = { Exception.class })
	@Override
	public Integer updateExamUserList(List<ExamUser> examUsers)
			throws Exception {
		return examUserService.updateExamUserList(examUsers);
	}

	@Override
	public Integer getExamUserIDSEQ() throws Exception {
		// TODO Auto-generated method stub
		return examUserService.getExamUserIDSEQ();
	}

	@Override
	public ExamUser getExamUser(ExamUser examUser) throws Exception {
		// TODO Auto-generated method stub
		return examUserService.getExamUser(examUser);
	}

	@Override
	public List<ExamUser> getExamUserList(ExamUser examUser) throws Exception {
		// TODO Auto-generated method stub
		return examUserService.getExamUserList(examUser);
	}
	
	
}
