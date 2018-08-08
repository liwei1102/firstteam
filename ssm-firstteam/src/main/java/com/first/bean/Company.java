package com.first.bean;

import java.util.Date;

public class Company {
    private Integer companyid;

    private Integer comploginid;

    private Integer adminid;

    private String tel;

    private Date registerdate;

    private String compname;

    private Date founddate;

    private String compproperty;

    private String mainpost;

    private String mainwork;

    private Integer clicknum;

    private Boolean station;

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getComploginid() {
        return comploginid;
    }

    public void setComploginid(Integer comploginid) {
        this.comploginid = comploginid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname == null ? null : compname.trim();
    }

    public Date getFounddate() {
        return founddate;
    }

    public void setFounddate(Date founddate) {
        this.founddate = founddate;
    }

    public String getCompproperty() {
        return compproperty;
    }

    public void setCompproperty(String compproperty) {
        this.compproperty = compproperty == null ? null : compproperty.trim();
    }

    public String getMainpost() {
        return mainpost;
    }

    public void setMainpost(String mainpost) {
        this.mainpost = mainpost == null ? null : mainpost.trim();
    }

    public String getMainwork() {
        return mainwork;
    }

    public void setMainwork(String mainwork) {
        this.mainwork = mainwork == null ? null : mainwork.trim();
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Boolean getStation() {
        return station;
    }

    public void setStation(Boolean station) {
        this.station = station;
    }
}