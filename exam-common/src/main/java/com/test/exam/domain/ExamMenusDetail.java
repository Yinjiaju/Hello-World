package com.test.exam.domain;

import java.io.Serializable;

public class ExamMenusDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer menuDetailId;
	private Integer menuId;
	private String menuDetailName;
	private String addedBy;
	private String addedDate;
	private String updatedBy;
	private String updatedDate;
	private String status;
	public Integer getMenuDetailId() {
		return menuDetailId;
	}
	public void setMenuDetailId(Integer menuDetailId) {
		this.menuDetailId = menuDetailId;
	}
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuDetailName() {
		return menuDetailName;
	}
	public void setMenuDetailName(String menuDetailName) {
		this.menuDetailName = menuDetailName;
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
	public ExamMenusDetail(Integer menuDetailId, Integer menuId,
			String menuDetailName, String addedBy, String addedDate,
			String updatedBy, String updatedDate, String status) {
		super();
		this.menuDetailId = menuDetailId;
		this.menuId = menuId;
		this.menuDetailName = menuDetailName;
		this.addedBy = addedBy;
		this.addedDate = addedDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.status = status;
	}
	
	
}
