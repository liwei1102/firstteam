package com.first.bean;

public class Administrator {
    private Integer adminid;

    private Integer adminloginid;

    private String adminname;

    private String gender;

    private String department;

    private String tel;

    private Boolean state;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getAdminloginid() {
        return adminloginid;
    }

    public void setAdminloginid(Integer adminloginid) {
        this.adminloginid = adminloginid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}