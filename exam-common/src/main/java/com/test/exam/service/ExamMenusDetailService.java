package com.test.exam.service;

import java.util.List;
import java.util.Map;

import com.test.exam.domain.ExamMenus;
import com.test.exam.domain.ExamMenusDetail;
import com.test.exam.domain.ExamResultsDetails;
import com.test.exam.domain.ExamTestHistory;
import com.test.exam.domain.ExamTestHistoryDetail;
import com.test.exam.domain.ExamTitle;
import com.test.exam.domain.ExamUser;

public interface ExamMenusDetailService {
	
	/**
	 * 关于exam_menus_detail的相关操作
	 * 
	 */
	public Integer insertExamMenusDetail(ExamMenusDetail examMenuDetail) throws Exception;
	
	public Integer insertExamMenusDetailList(List<ExamMenusDetail> examMenuDetails) throws Exception;
	
	public Integer updateExamMenusDetail(ExamMenusDetail examMenuDetail) throws Exception;
	
	public Integer updateExamMenusDetailList(List<ExamMenusDetail> examMenuDetails) throws Exception;
	
	public Integer getExamMenusDetailIDSEQ() throws Exception;
	
	public ExamMenusDetail getExamMenusDetail(ExamMenusDetail examMenuDetail) throws Exception;
	
	public List<ExamMenusDetail> getExamMenusDetailList(ExamMenusDetail examMenuDetail) throws Exception;
}
