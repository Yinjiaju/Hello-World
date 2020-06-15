package com.test.exam.service;

import java.util.List;

import com.test.exam.domain.ExamUser;

public interface ExamUserService {
	
	/**
	 * 关于exam_user的相关操作
	 */
	public Integer insertExamUser(ExamUser examUser) throws Exception;
	
	public Integer insertExamUserList(List<ExamUser> examUsers) throws Exception;
	
	public Integer updateExamUser(ExamUser examUser) throws Exception;
	
	public Integer updateExamUserList(List<ExamUser> examUsers) throws Exception;
	
	public Integer getExamUserIDSEQ() throws Exception;
	
	public ExamUser getExamUser(ExamUser examUser) throws Exception;
	
	public List<ExamUser> getExamUserList(ExamUser examUser) throws Exception;

}
