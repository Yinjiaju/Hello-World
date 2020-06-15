package com.test.exam.domain;

import java.io.Serializable;

public class ExamMenus implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    private Integer menuId;

    private String menuName;

    private String addedBy;

    private String addedDate;

    private String updatedBy;

    private String updatedDate;

    private String status;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
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

    public ExamMenus(Integer menuId, String menuName, String addedBy, String addedDate, String updatedBy,
            String updatedDate, String status) {
        super();
        this.menuId = menuId;
        this.menuName = menuName;
        this.addedBy = addedBy;
        this.addedDate = addedDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.status = status;
    }

    public ExamMenus() {
        super();
    }

}
