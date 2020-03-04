package com.test.exam.domain;

import java.io.Serializable;

public class ExamUser implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ExamUser(Integer userId, String userName, String password,
			String status, String roleType, String addedBy, String addedDate,
			String updatedBy, String updatedDate, String userMenus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.roleType = roleType;
		this.addedBy = addedBy;
		this.addedDate = addedDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.userMenus = userMenus;
	}
	private Integer userId;
	private String userName;
	private String password;
	private String status;
	private String roleType;
	private String addedBy;
	private String addedDate;
	private String updatedBy;
	private String updatedDate;
	private String userMenus;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
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
	public String getUserMenus() {
		return userMenus;
	}
	public void setUserMenus(String userMenus) {
		this.userMenus = userMenus;
	}
	
	
}
