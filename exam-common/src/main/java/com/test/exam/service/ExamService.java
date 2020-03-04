package com.test.exam.service;

import java.util.List;

import com.test.exam.domain.ExamMenus;
import com.test.exam.domain.ExamMenusDetail;
import com.test.exam.domain.ExamResultsDetails;
import com.test.exam.domain.ExamTestHistory;
import com.test.exam.domain.ExamTestHistoryDetail;
import com.test.exam.domain.ExamTitle;
import com.test.exam.domain.ExamUser;

public interface ExamService {
	
	/**
	 * 关于exam_user的相关操作
	 */
	public Integer insertExamUser(ExamUser examUser) throws Exception;
	
	public Integer insertExamUserList(List<ExamUser> examUsers) throws Exception;
	
	public Integer updateExamUser(ExamUser examUser) throws Exception;
	
	public Integer updateExamUserList(List<ExamUser> examUsers) throws Exception;
	
	
	/**
	 * 关于exam_menus的相关操作
	 * 
	 */
	public Integer insertExamMenus(ExamMenus examMenu) throws Exception;
	
	public Integer insertExamMenusList(List<ExamMenus> examMenus) throws Exception;
	
	public Integer updateExamMenus(ExamMenus examMenu) throws Exception;
	
	public Integer updateExamMenusList(List<ExamMenus> examMenus) throws Exception;
	
	/**
	 * 关于exam_menus_detail的相关操作
	 * 
	 */
	public Integer insertExamMenusDetail(ExamMenusDetail examMenuDetail) throws Exception;
	
	public Integer insertExamMenusDetailList(List<ExamMenusDetail> examMenuDetails) throws Exception;
	
	public Integer updateExamMenusDetail(ExamMenusDetail examMenuDetail) throws Exception;
	
	public Integer updateExamMenusDetailList(List<ExamMenusDetail> examMenuDetails) throws Exception;
	
	
	/**
	 * 关于exam_title的相关操作
	 * 
	 */
	public Integer insertExamTitle(ExamTitle examTitle) throws Exception;
	
	public Integer insertExamTitleList(List<ExamTitle> examTitles) throws Exception;
	
	public Integer updateExamTitle(ExamTitle examTitle) throws Exception;
	
	public Integer updateExamTitleList(List<ExamTitle> examTitles) throws Exception;
	
	
	/**
	 * 关于exam_results_details的相关操作
	 * 
	 */
	public Integer insertExamResultsDetails(ExamResultsDetails examResultsDetail) throws Exception;
	
	public Integer insertExamResultsDetailsList(List<ExamResultsDetails> examResultsDetails) throws Exception;
	
	public Integer updateExamResultsDetails(ExamResultsDetails examResultsDetail) throws Exception;
	
	public Integer updateExamResultsDetailsList(List<ExamResultsDetails> examResultsDetails) throws Exception;
	
	
	/**
	 * 关于exam_test_history的相关操作
	 * 
	 */
	public Integer insertExamTestHistory(ExamTestHistory examTestHistory) throws Exception;
	
	public Integer insertExamTestHistoryList(List<ExamTestHistory> examTestHistorys) throws Exception;
	
	public Integer updateExamTestHistory(ExamTestHistory examTestHistory) throws Exception;
	
	public Integer updateExamTestHistoryList(List<ExamTestHistory> examTestHistorys) throws Exception;
	
	/**
	 * 关于exam_test_history_detail的相关操作
	 * 
	 */
	public Integer insertExamTestHistoryDetail(ExamTestHistoryDetail examTestHistoryDetail) throws Exception;
	
	public Integer insertExamTestHistoryDetailList(List<ExamTestHistoryDetail> examTestHistoryDetails) throws Exception;
	
	public Integer updateExamTestHistoryDetail(ExamTestHistoryDetail examTestHistoryDetail) throws Exception;
	
	public Integer updateExamTestHistoryDetailList(List<ExamTestHistoryDetail> examTestHistoryDetails) throws Exception;
	
}
