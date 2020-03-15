package com.test.exam.dao;

import java.util.List;

import com.test.exam.domain.ExamMenusDetail;

public interface ExamMenusDetailDao {
	
	public Integer insert(ExamMenusDetail examMenusDetail) throws Exception;
	
	public Integer insertList(List<ExamMenusDetail> examMenusDetail) throws Exception;
	
	public Integer update(ExamMenusDetail examMenusDetail) throws Exception;
	
	public Integer updateList(List<ExamMenusDetail> examMenusDetail) throws Exception;
	
	public ExamMenusDetail get(ExamMenusDetail examMenusDetail) throws Exception;
	
	public List<ExamMenusDetail> getList(ExamMenusDetail examMenusDetail) throws Exception;
	
	public Integer getExamDetailIDSEQ() throws Exception;
}
