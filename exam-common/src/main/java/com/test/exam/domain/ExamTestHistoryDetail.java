package com.test.exam.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class ExamTestHistoryDetail implements Serializable{
	
	
	private String testId;
	private String testName;
	private Integer testUserId;
	private String testTitleId;
	private String testTitleUserResult;
	private String testTitleCheckResult;
	private BigDecimal testUserScore;
	private String addedBy;
	private String addedDate;
	private String updatedBy;
	private String updatedDate;
	private String sortId;
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
	public Integer getTestUserId() {
		return testUserId;
	}
	public void setTestUserId(Integer testUserId) {
		this.testUserId = testUserId;
	}
	public String getTestTitleId() {
		return testTitleId;
	}
	public void setTestTitleId(String testTitleId) {
		this.testTitleId = testTitleId;
	}
	public String getTestTitleUserResult() {
		return testTitleUserResult;
	}
	public void setTestTitleUserResult(String testTitleUserResult) {
		this.testTitleUserResult = testTitleUserResult;
	}
	public String getTestTitleCheckResult() {
		return testTitleCheckResult;
	}
	public void setTestTitleCheckResult(String testTitleCheckResult) {
		this.testTitleCheckResult = testTitleCheckResult;
	}
	public BigDecimal getTestUserScore() {
		return testUserScore;
	}
	public void setTestUserScore(BigDecimal testUserScore) {
		this.testUserScore = testUserScore;
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
	public String getSortId() {
		return sortId;
	}
	public void setSortId(String sortId) {
		this.sortId = sortId;
	}
	public ExamTestHistoryDetail(String testId, String testName,
			Integer testUserId, String testTitleId, String testTitleUserResult,
			String testTitleCheckResult, BigDecimal testUserScore,
			String addedBy, String addedDate, String updatedBy,
			String updatedDate, String sortId) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testUserId = testUserId;
		this.testTitleId = testTitleId;
		this.testTitleUserResult = testTitleUserResult;
		this.testTitleCheckResult = testTitleCheckResult;
		this.testUserScore = testUserScore;
		this.addedBy = addedBy;
		this.addedDate = addedDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.sortId = sortId;
	}
	
}
