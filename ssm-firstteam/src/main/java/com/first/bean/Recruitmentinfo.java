package com.first.bean;

import java.util.Date;

public class Recruitmentinfo {
    private Integer infoid;

    private Integer companyid;

    private String company;

    private Date dates;

    private String post;

    private Integer numbers;

    private String salary;

    private String educationalrequest;

    private String specialty;

    private String jobaddress;

    private String person;

    private String tel;

    private String email;

    private Integer click;

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getEducationalrequest() {
        return educationalrequest;
    }

    public void setEducationalrequest(String educationalrequest) {
        this.educationalrequest = educationalrequest == null ? null : educationalrequest.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getJobaddress() {
        return jobaddress;
    }

    public void setJobaddress(String jobaddress) {
        this.jobaddress = jobaddress == null ? null : jobaddress.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }
}