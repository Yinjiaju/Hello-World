package com.test.exam.service;

import java.util.List;

import com.test.exam.domain.ExamMenus;
import com.test.exam.domain.ExamMenusDetail;
import com.test.exam.domain.ExamResultsDetails;
import com.test.exam.domain.ExamTestHistory;
import com.test.exam.domain.ExamTestHistoryDetail;
import com.test.exam.domain.ExamTitle;
import com.test.exam.domain.ExamUser;

public interface ExamMenusService {
	
	
	/**
	 * 关于exam_menus的相关操作
	 * 
	 */
	public Integer insertExamMenus(ExamMenus examMenu) throws Exception;
	
	public Integer insertExamMenusList(List<ExamMenus> examMenus) throws Exception;
	
	public Integer updateExamMenus(ExamMenus examMenu) throws Exception;
	
	public Integer updateExamMenusList(List<ExamMenus> examMenus) throws Exception;
	
	public Integer getExamMenusIDSEQ() throws Exception;
	
	public ExamMenus getExamMenus(ExamMenus examMenus) throws Exception;
	
	public List<ExamMenus> getExamMenusList(ExamMenus examMenus) throws Exception;
}
