package com.first.bean;

public class School {
    private Integer schoolid;

    private String schoolname;

    private String englishname;

    private String address;

    private String schooltype;

    private String nameofprincipal;

    private String telofprincipal;

    private String telofschool;

    private String postalcode;

    private String homepage;

    private String emailofschool;

    private String history;

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname == null ? null : englishname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSchooltype() {
        return schooltype;
    }

    public void setSchooltype(String schooltype) {
        this.schooltype = schooltype == null ? null : schooltype.trim();
    }

    public String getNameofprincipal() {
        return nameofprincipal;
    }

    public void setNameofprincipal(String nameofprincipal) {
        this.nameofprincipal = nameofprincipal == null ? null : nameofprincipal.trim();
    }

    public String getTelofprincipal() {
        return telofprincipal;
    }

    public void setTelofprincipal(String telofprincipal) {
        this.telofprincipal = telofprincipal == null ? null : telofprincipal.trim();
    }

    public String getTelofschool() {
        return telofschool;
    }

    public void setTelofschool(String telofschool) {
        this.telofschool = telofschool == null ? null : telofschool.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage == null ? null : homepage.trim();
    }

    public String getEmailofschool() {
        return emailofschool;
    }

    public void setEmailofschool(String emailofschool) {
        this.emailofschool = emailofschool == null ? null : emailofschool.trim();
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history == null ? null : history.trim();
    }
}