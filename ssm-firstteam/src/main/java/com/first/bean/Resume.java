package com.first.bean;

public class Resume {
    private Integer resumeid;

    private Integer stuextendid;

    private String resumestatus;

    private Boolean employeed;

    private String resumeresult;

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Integer getStuextendid() {
        return stuextendid;
    }

    public void setStuextendid(Integer stuextendid) {
        this.stuextendid = stuextendid;
    }

    public String getResumestatus() {
        return resumestatus;
    }

    public void setResumestatus(String resumestatus) {
        this.resumestatus = resumestatus == null ? null : resumestatus.trim();
    }

    public Boolean getEmployeed() {
        return employeed;
    }

    public void setEmployeed(Boolean employeed) {
        this.employeed = employeed;
    }

    public String getResumeresult() {
        return resumeresult;
    }

    public void setResumeresult(String resumeresult) {
        this.resumeresult = resumeresult == null ? null : resumeresult.trim();
    }
}