package com.test.exam.dao;

import java.util.List;

import com.test.exam.domain.ExamMenus;

public interface ExamMenusDao {
	
	public Integer insert(ExamMenus examMenu) throws Exception;
	
	public Integer insertList(List<ExamMenus> examMenus) throws Exception;
	
	public Integer update(ExamMenus examMenu) throws Exception;
	
	public Integer updateList(List<ExamMenus> examMenus) throws Exception;
	
	public ExamMenus get(ExamMenus examMenu) throws Exception;
	
	public List<ExamMenus> getList(ExamMenus examMenu) throws Exception;
}
