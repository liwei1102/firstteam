package com.first.bean;

import java.io.Serializable;

public class Comp_stuKey implements Serializable{
    private Integer stuid;

    private Integer companyid;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }
}