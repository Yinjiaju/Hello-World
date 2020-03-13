package com.test.exam.dao;

import java.util.List;

import com.test.exam.domain.ExamTestHistory;

public interface ExamTestHistoryDao {
	
	public Integer insert(ExamTestHistory examTestHistory) throws Exception;
	
	public Integer insertList(List<ExamTestHistory> examTestHistory) throws Exception;
	
	public Integer update(ExamTestHistory examTestHistory) throws Exception;
	
	public Integer updateList(List<ExamTestHistory> examTestHistory) throws Exception;
	
	public ExamTestHistory get(ExamTestHistory examTestHistory) throws Exception;
	
	public List<ExamTestHistory> getList(ExamTestHistory examTestHistory) throws Exception;
}
