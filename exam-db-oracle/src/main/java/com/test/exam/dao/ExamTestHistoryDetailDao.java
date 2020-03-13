package com.test.exam.dao;

import java.util.List;

import com.test.exam.domain.ExamTestHistoryDetail;

public interface ExamTestHistoryDetailDao {
	
	public Integer insert(ExamTestHistoryDetail examTestHistoryDetail) throws Exception;
	
	public Integer insertList(List<ExamTestHistoryDetail> examTestHistoryDetail) throws Exception;
	
	public Integer update(ExamTestHistoryDetail examTestHistoryDetail) throws Exception;
	
	public Integer updateList(List<ExamTestHistoryDetail> examTestHistoryDetail) throws Exception;
	
	public ExamTestHistoryDetail get(ExamTestHistoryDetail examTestHistoryDetail) throws Exception;
	
	public List<ExamTestHistoryDetail> getList(ExamTestHistoryDetail examTestHistoryDetail) throws Exception;
}
