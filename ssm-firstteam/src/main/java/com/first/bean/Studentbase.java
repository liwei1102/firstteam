package com.first.bean;

import java.util.Date;

public class Studentbase {
    private Integer stuid;

    private Integer stuloginid;

    private Integer adminid;

    private Integer studentid;

    private String stuname;

    private String gender;

    private String identifynumber;

    private Date registerdate;

    private Date birthdate;

    private String originplace;

    private String nation;

    private String lengths;

    private String politticalstatus;

    private String college;

    private String major;

    private Boolean station;

    private Integer click;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getStuloginid() {
        return stuloginid;
    }

    public void setStuloginid(Integer stuloginid) {
        this.stuloginid = stuloginid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIdentifynumber() {
        return identifynumber;
    }

    public void setIdentifynumber(String identifynumber) {
        this.identifynumber = identifynumber == null ? null : identifynumber.trim();
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getOriginplace() {
        return originplace;
    }

    public void setOriginplace(String originplace) {
        this.originplace = originplace == null ? null : originplace.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getLengths() {
        return lengths;
    }

    public void setLengths(String lengths) {
        this.lengths = lengths == null ? null : lengths.trim();
    }

    public String getPolitticalstatus() {
        return politticalstatus;
    }

    public void setPolitticalstatus(String politticalstatus) {
        this.politticalstatus = politticalstatus == null ? null : politticalstatus.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Boolean getStation() {
        return station;
    }

    public void setStation(Boolean station) {
        this.station = station;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }
}