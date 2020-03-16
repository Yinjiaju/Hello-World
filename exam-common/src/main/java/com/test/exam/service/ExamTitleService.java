package com.test.exam.service;

import java.util.List;

import com.test.exam.domain.ExamMenus;
import com.test.exam.domain.ExamMenusDetail;
import com.test.exam.domain.ExamResultsDetails;
import com.test.exam.domain.ExamTestHistory;
import com.test.exam.domain.ExamTestHistoryDetail;
import com.test.exam.domain.ExamTitle;
import com.test.exam.domain.ExamUser;

public interface ExamTitleService {
	
	/**
	 * 关于exam_title的相关操作
	 * 
	 */
	public Integer insertExamTitle(ExamTitle examTitle) throws Exception;
	
	public Integer insertExamTitleList(List<ExamTitle> examTitles) throws Exception;
	
	public Integer updateExamTitle(ExamTitle examTitle) throws Exception;
	
	public Integer updateExamTitleList(List<ExamTitle> examTitles) throws Exception;
	
	public Integer getExamTitleIDSEQ() throws Exception;

	public ExamTitle getExamTitle(ExamTitle examTitle) throws Exception;
	
	public List<ExamTitle> getExamTitleList(ExamTitle examTitle) throws Exception;

}
