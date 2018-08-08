package com.first.bean;

public class Studentextend {
    private Integer stuextendid;

    private Integer stuid;

    private String foreignlanguages;

    private String forlangproficiency;

    private String computerlevel;

    private String mandarinlevel;

    private String expectjoblocation;

    private String expectjobpost;

    private String expectsalary;

    private String tel;

    private String address;

    private String picturepath;

    public Integer getStuextendid() {
        return stuextendid;
    }

    public void setStuextendid(Integer stuextendid) {
        this.stuextendid = stuextendid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getForeignlanguages() {
        return foreignlanguages;
    }

    public void setForeignlanguages(String foreignlanguages) {
        this.foreignlanguages = foreignlanguages == null ? null : foreignlanguages.trim();
    }

    public String getForlangproficiency() {
        return forlangproficiency;
    }

    public void setForlangproficiency(String forlangproficiency) {
        this.forlangproficiency = forlangproficiency == null ? null : forlangproficiency.trim();
    }

    public String getComputerlevel() {
        return computerlevel;
    }

    public void setComputerlevel(String computerlevel) {
        this.computerlevel = computerlevel == null ? null : computerlevel.trim();
    }

    public String getMandarinlevel() {
        return mandarinlevel;
    }

    public void setMandarinlevel(String mandarinlevel) {
        this.mandarinlevel = mandarinlevel == null ? null : mandarinlevel.trim();
    }

    public String getExpectjoblocation() {
        return expectjoblocation;
    }

    public void setExpectjoblocation(String expectjoblocation) {
        this.expectjoblocation = expectjoblocation == null ? null : expectjoblocation.trim();
    }

    public String getExpectjobpost() {
        return expectjobpost;
    }

    public void setExpectjobpost(String expectjobpost) {
        this.expectjobpost = expectjobpost == null ? null : expectjobpost.trim();
    }

    public String getExpectsalary() {
        return expectsalary;
    }

    public void setExpectsalary(String expectsalary) {
        this.expectsalary = expectsalary == null ? null : expectsalary.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPicturepath() {
        return picturepath;
    }

    public void setPicturepath(String picturepath) {
        this.picturepath = picturepath == null ? null : picturepath.trim();
    }
}