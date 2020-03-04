package com.test.exam.domain;

import java.io.Serializable;

public class ExamTitle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer titleId;
	private String titleName;
	private Integer titleType;
	private String titleTypeName;
	private String addedBy;
	private String addedDate;
	private String updatedBy;
	private String updatedDate;
	private String titleLevel;
	private String titleChapter;
	private String titleKnowledge;
	private Integer uuId;//用来建立随机数的
	public Integer getTitleId() {
		return titleId;
	}
	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public Integer getTitleType() {
		return titleType;
	}
	public void setTitleType(Integer titleType) {
		this.titleType = titleType;
	}
	public String getTitleTypeName() {
		return titleTypeName;
	}
	public void setTitleTypeName(String titleTypeName) {
		this.titleTypeName = titleTypeName;
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
	public String getTitleLevel() {
		return titleLevel;
	}
	public void setTitleLevel(String titleLevel) {
		this.titleLevel = titleLevel;
	}
	public String getTitleChapter() {
		return titleChapter;
	}
	public void setTitleChapter(String titleChapter) {
		this.titleChapter = titleChapter;
	}
	public String getTitleKnowledge() {
		return titleKnowledge;
	}
	public void setTitleKnowledge(String titleKnowledge) {
		this.titleKnowledge = titleKnowledge;
	}
	public ExamTitle(Integer titleId, String titleName, Integer titleType,
			String titleTypeName, String addedBy, String addedDate,
			String updatedBy, String updatedDate, String titleLevel,
			String titleChapter, String titleKnowledge) {
		super();
		this.titleId = titleId;
		this.titleName = titleName;
		this.titleType = titleType;
		this.titleTypeName = titleTypeName;
		this.addedBy = addedBy;
		this.addedDate = addedDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.titleLevel = titleLevel;
		this.titleChapter = titleChapter;
		this.titleKnowledge = titleKnowledge;
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
	public Integer getUuId() {
		return uuId;
	}
	public void setUuId(Integer uuId) {
		this.uuId = uuId;
	}
	
}
