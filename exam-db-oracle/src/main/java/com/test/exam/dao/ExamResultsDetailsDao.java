package com.test.exam.dao;

import java.util.List;

import com.test.exam.domain.ExamResultsDetails;

public interface ExamResultsDetailsDao {
	
	public Integer insert(ExamResultsDetails examResultsDetails) throws Exception;
	
	public Integer insertList(List<ExamResultsDetails> examResultsDetails) throws Exception;
	
	public Integer update(ExamResultsDetails examResultsDetails) throws Exception;
	
	public Integer updateList(List<ExamResultsDetails> examResultsDetails) throws Exception;
	
	public ExamResultsDetails get(ExamResultsDetails examResultsDetails) throws Exception;
	
	public List<ExamResultsDetails> getList(ExamResultsDetails examResultsDetails) throws Exception;
}
