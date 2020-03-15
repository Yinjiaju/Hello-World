package com.test.exam.dao;

import java.util.List;

import com.test.exam.domain.ExamUser;

public interface ExamUserDao {
	
	public Integer insert(ExamUser examUser) throws Exception;
	
	public Integer insertList(List<ExamUser> examUser) throws Exception;
	
	public Integer update(ExamUser examUser) throws Exception;
	
	public Integer updateList(List<ExamUser> examUser) throws Exception;
	
	public ExamUser get(ExamUser examUser) throws Exception;
	
	public List<ExamUser> getList(ExamUser examUser) throws Exception;
	
	public Integer getExamUserSEQ() throws Exception;
}
