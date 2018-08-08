package com.first.bean;

import java.util.Date;

public class Employeementpolicy {
    private Integer policyid;

    private Integer adminid;

    private String policyname;

    private String issuer;

    private Date publishdate;

    private String auditunit;

    private String content;

    public Integer getPolicyid() {
        return policyid;
    }

    public void setPolicyid(Integer policyid) {
        this.policyid = policyid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getPolicyname() {
        return policyname;
    }

    public void setPolicyname(String policyname) {
        this.policyname = policyname == null ? null : policyname.trim();
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer == null ? null : issuer.trim();
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public String getAuditunit() {
        return auditunit;
    }

    public void setAuditunit(String auditunit) {
        this.auditunit = auditunit == null ? null : auditunit.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}