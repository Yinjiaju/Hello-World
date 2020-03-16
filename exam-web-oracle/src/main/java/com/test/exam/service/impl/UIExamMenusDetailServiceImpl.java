package com.test.exam.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.test.exam.domain.ExamMenusDetail;
import com.test.exam.service.ExamMenusDetailService;
import com.test.exam.service.UIExamMenusDetailService;

@Service
@Component
public class UIExamMenusDetailServiceImpl implements UIExamMenusDetailService{
	
	@Reference(timeout=1800000,version="examMenusDetailService",check=false)
    private ExamMenusDetailService examMenusDetailService;
	
    @Override
    public Integer insertExamMenusDetail(ExamMenusDetail examMenuDetail) throws Exception {
        // TODO Auto-generated method stub
        return examMenusDetailService.insertExamMenusDetail(examMenuDetail);
    }

    @Override
    public Integer insertExamMenusDetailList(List<ExamMenusDetail> examMenuDetails) throws Exception {
        // TODO Auto-generated method stub
        return examMenusDetailService.insertExamMenusDetailList(examMenuDetails);
    }

    @Override
    public Integer updateExamMenusDetail(ExamMenusDetail examMenuDetail) throws Exception {
        // TODO Auto-generated method stub
        return examMenusDetailService.updateExamMenusDetail(examMenuDetail);
    }
    
    @Transactional(rollbackFor = { Exception.class })
    @Override
    public Integer updateExamMenusDetailList(List<ExamMenusDetail> examMenuDetails) throws Exception {
        return examMenusDetailService.updateExamMenusDetailList(examMenuDetails);
    }

    @Override
    public Integer getExamMenusDetailIDSEQ() throws Exception {
        // TODO Auto-generated method stub
        return examMenusDetailService.getExamMenusDetailIDSEQ();
    }

	@Override
	public ExamMenusDetail getExamMenusDetail(ExamMenusDetail examMenuDetail)
			throws Exception {
		// TODO Auto-generated method stub
		return examMenusDetailService.getExamMenusDetail(examMenuDetail);
	}

	@Override
	public List<ExamMenusDetail> getExamMenusDetailList(
			ExamMenusDetail examMenuDetail) throws Exception {
		// TODO Auto-generated method stub
		return examMenusDetailService.getExamMenusDetailList(examMenuDetail);
	}
	
	

}
