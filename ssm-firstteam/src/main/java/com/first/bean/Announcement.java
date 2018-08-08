package com.first.bean;

import java.util.Date;

public class Announcement {
    private Integer annoid;

    private Integer adminid;

    private String annoname;

    private String issuer;

    private Date publishdate;

    private String auditunit;

    private String picturepath;

    private String content;

    public Integer getAnnoid() {
        return annoid;
    }

    public void setAnnoid(Integer annoid) {
        this.annoid = annoid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAnnoname() {
        return annoname;
    }

    public void setAnnoname(String annoname) {
        this.annoname = annoname == null ? null : annoname.trim();
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

    public String getPicturepath() {
        return picturepath;
    }

    public void setPicturepath(String picturepath) {
        this.picturepath = picturepath == null ? null : picturepath.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}