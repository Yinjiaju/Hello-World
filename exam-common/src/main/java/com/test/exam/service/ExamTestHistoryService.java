package com.test.exam.service;

import java.util.List;

import com.test.exam.domain.ExamMenus;
import com.test.exam.domain.ExamMenusDetail;
import com.test.exam.domain.ExamResultsDetails;
import com.test.exam.domain.ExamTestHistory;
import com.test.exam.domain.ExamTestHistoryDetail;
import com.test.exam.domain.ExamTitle;
import com.test.exam.domain.ExamUser;

public interface ExamTestHistoryService {

	/**
	 * 关于exam_test_history的相关操作
	 * 
	 */
	public Integer insertExamTestHistory(ExamTestHistory examTestHistory) throws Exception;
	
	public Integer insertExamTestHistoryList(List<ExamTestHistory> examTestHistorys) throws Exception;
	
	public Integer updateExamTestHistory(ExamTestHistory examTestHistory) throws Exception;
	
	public Integer updateExamTestHistoryList(List<ExamTestHistory> examTestHistorys) throws Exception;
	
	
}
