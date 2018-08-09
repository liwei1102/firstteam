package com.first.bean;

import java.io.Serializable;

public class Comp_resumeKey implements Serializable{
    private Integer resumeid;

    private Integer companyid;

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }
}