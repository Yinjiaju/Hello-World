package com.test.exam.service;

import java.util.List;

import com.test.exam.domain.ExamMenus;
import com.test.exam.domain.ExamMenusDetail;
import com.test.exam.domain.ExamResultsDetails;
import com.test.exam.domain.ExamTestHistory;
import com.test.exam.domain.ExamTestHistoryDetail;
import com.test.exam.domain.ExamTitle;
import com.test.exam.domain.ExamUser;

public interface UIExamResultsDetailsService {
	
	
	/**
	 * 关于exam_results_details的相关操作
	 * 
	 */
	public Integer insertExamResultsDetails(ExamResultsDetails examResultsDetail) throws Exception;
	
	public Integer insertExamResultsDetailsList(List<ExamResultsDetails> examResultsDetails) throws Exception;
	
	public Integer updateExamResultsDetails(ExamResultsDetails examResultsDetail) throws Exception;
	
	public Integer updateExamResultsDetailsList(List<ExamResultsDetails> examResultsDetails) throws Exception;
	
	public ExamResultsDetails getExamResultsDetails(ExamResultsDetails examResultsDetail) throws Exception;
	
	public List<ExamResultsDetails> getExamResultsDetailsList(ExamResultsDetails examResultsDetail) throws Exception;
}
