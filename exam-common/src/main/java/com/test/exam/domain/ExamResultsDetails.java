package com.test.exam.domain;

import java.io.Serializable;

public class ExamResultsDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resultName;
	private Boolean resultIsTrue;
	private Integer titleId;
	private String addedBy;
	private String addedDate;
	private String updatedBy;
	private String updatedDate;
	private String status;
	private String resultId;
	public String getResultName() {
		return resultName;
	}
	public void setResultName(String resultName) {
		this.resultName = resultName;
	}
	public Boolean getResultIsTrue() {
		return resultIsTrue;
	}
	public void setResultIsTrue(Boolean resultIsTrue) {
		this.resultIsTrue = resultIsTrue;
	}
	public Integer getTitleId() {
		return titleId;
	}
	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public String getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResultId() {
		return resultId;
	}
	public void setResultId(String resultId) {
		this.resultId = resultId;
	}
	public ExamResultsDetails(String resultName, Boolean resultIsTrue,
			Integer titleId, String addedBy, String addedDate,
			String updatedBy, String updatedDate, String status, String resultId) {
		super();
		this.resultName = resultName;
		this.resultIsTrue = resultIsTrue;
		this.titleId = titleId;
		this.addedBy = addedBy;
		this.addedDate = addedDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.status = status;
		this.resultId = resultId;
	}
	
	
}
