package com.first.bean;

import java.util.Date;

public class News {
    private Integer newsid;

    private Integer adminid;

    private String newshead;

    private String publishcomp;

    private Date publishdate;

    private Boolean readerscope;

    private String keyword;

    private Integer click;

    private String newstext;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getNewshead() {
        return newshead;
    }

    public void setNewshead(String newshead) {
        this.newshead = newshead == null ? null : newshead.trim();
    }

    public String getPublishcomp() {
        return publishcomp;
    }

    public void setPublishcomp(String publishcomp) {
        this.publishcomp = publishcomp == null ? null : publishcomp.trim();
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public Boolean getReaderscope() {
        return readerscope;
    }

    public void setReaderscope(Boolean readerscope) {
        this.readerscope = readerscope;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public String getNewstext() {
        return newstext;
    }

    public void setNewstext(String newstext) {
        this.newstext = newstext == null ? null : newstext.trim();
    }
}