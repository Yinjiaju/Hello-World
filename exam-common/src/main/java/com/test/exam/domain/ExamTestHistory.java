package com.test.exam.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class ExamTestHistory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String testId;
	private String testName;
	private String addedBy;
	private String addedDate;
	private String updatedBy;
	private String updatedDate;
	private Integer testUserId;
	private String testUserName;
	private BigDecimal testUserScores;
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
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
	public String getupdatedBy() {
		return updatedBy;
	}
	public void setupdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getupdatedDate() {
		return updatedDate;
	}
	public void setupdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Integer getTestUserId() {
		return testUserId;
	}
	public void setTestUserId(Integer testUserId) {
		this.testUserId = testUserId;
	}
	public String getTestUserName() {
		return testUserName;
	}
	public void setTestUserName(String testUserName) {
		this.testUserName = testUserName;
	}
	public BigDecimal getTestUserScores() {
		return testUserScores;
	}
	public void setTestUserScores(BigDecimal testUserScores) {
		this.testUserScores = testUserScores;
	}
	public ExamTestHistory(String testId, String testName, String addedBy,
			String addedDate, String updatedBy, String updatedDate,
			Integer testUserId, String testUserName, BigDecimal testUserScores) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.addedBy = addedBy;
		this.addedDate = addedDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.testUserId = testUserId;
		this.testUserName = testUserName;
		this.testUserScores = testUserScores;
	}
	
	
}
