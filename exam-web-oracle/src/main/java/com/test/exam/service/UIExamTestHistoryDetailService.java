package com.test.exam.service;

import java.util.List;

import com.test.exam.domain.ExamMenus;
import com.test.exam.domain.ExamMenusDetail;
import com.test.exam.domain.ExamResultsDetails;
import com.test.exam.domain.ExamTestHistory;
import com.test.exam.domain.ExamTestHistoryDetail;
import com.test.exam.domain.ExamTitle;
import com.test.exam.domain.ExamUser;

public interface UIExamTestHistoryDetailService {
	
	/**
	 * 关于exam_test_history_detail的相关操作
	 * 
	 */
	public Integer insertExamTestHistoryDetail(ExamTestHistoryDetail examTestHistoryDetail) throws Exception;
	
	public Integer insertExamTestHistoryDetailList(List<ExamTestHistoryDetail> examTestHistoryDetails) throws Exception;
	
	public Integer updateExamTestHistoryDetail(ExamTestHistoryDetail examTestHistoryDetail) throws Exception;
	
	public Integer updateExamTestHistoryDetailList(List<ExamTestHistoryDetail> examTestHistoryDetails) throws Exception;
	
	public ExamTestHistoryDetail getExamTestHistoryDetail(ExamTestHistoryDetail examTestHistoryDetail) throws Exception;
	
	public List<ExamTestHistoryDetail> getExamTestHistoryDetailList(ExamTestHistoryDetail examTestHistoryDetail) throws Exception;
}
