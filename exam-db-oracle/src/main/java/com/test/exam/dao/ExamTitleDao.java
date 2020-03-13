package com.test.exam.dao;

import java.util.List;

import com.test.exam.domain.ExamTitle;

public interface ExamTitleDao {
	
	public Integer insert(ExamTitle examTitle) throws Exception;
	
	public Integer insertList(List<ExamTitle> examTitle) throws Exception;
	
	public Integer update(ExamTitle examTitle) throws Exception;
	
	public Integer updateList(List<ExamTitle> examTitle) throws Exception;
	
	public ExamTitle get(ExamTitle examTitle) throws Exception;
	
	public List<ExamTitle> getList(ExamTitle examTitle) throws Exception;
}
