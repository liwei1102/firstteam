package com.first.bean;

import java.util.Date;

public class Household {
    private Integer householdid;

    private Integer stuid;

    private String name;

    private Date bthdate;

    private String identifynum;

    private String nativeplace;

    private String maritalstatus;

    private String educationlevel;

    public Integer getHouseholdid() {
        return householdid;
    }

    public void setHouseholdid(Integer householdid) {
        this.householdid = householdid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBthdate() {
        return bthdate;
    }

    public void setBthdate(Date bthdate) {
        this.bthdate = bthdate;
    }

    public String getIdentifynum() {
        return identifynum;
    }

    public void setIdentifynum(String identifynum) {
        this.identifynum = identifynum == null ? null : identifynum.trim();
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus == null ? null : maritalstatus.trim();
    }

    public String getEducationlevel() {
        return educationlevel;
    }

    public void setEducationlevel(String educationlevel) {
        this.educationlevel = educationlevel == null ? null : educationlevel.trim();
    }
}