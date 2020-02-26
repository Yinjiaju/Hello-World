package com.test.exam.domain;

public class UIResult {
    private Boolean flag = false;
    private String message;
    private Object result;
    public Boolean getFlag() {
        return flag;
    }
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getResult() {
        return result;
    }
    public void setResult(Object result) {
        this.result = result;
        this.flag = true;
    }
    
}
