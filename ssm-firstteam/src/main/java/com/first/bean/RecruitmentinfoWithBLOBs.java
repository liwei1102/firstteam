package com.first.bean;

import java.io.Serializable;

public class RecruitmentinfoWithBLOBs extends Recruitmentinfo implements Serializable{
    private String recruitrequest;

    private String other;

    public String getRecruitrequest() {
        return recruitrequest;
    }

    public void setRecruitrequest(String recruitrequest) {
        this.recruitrequest = recruitrequest == null ? null : recruitrequest.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}