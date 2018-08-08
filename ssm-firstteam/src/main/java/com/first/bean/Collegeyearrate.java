package com.first.bean;

public class Collegeyearrate {
    private Integer collegeyearrateid;

    private Integer collegeid;

    private String years;

    private String anveragerate;

    public Integer getCollegeyearrateid() {
        return collegeyearrateid;
    }

    public void setCollegeyearrateid(Integer collegeyearrateid) {
        this.collegeyearrateid = collegeyearrateid;
    }

    public Integer getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years == null ? null : years.trim();
    }

    public String getAnveragerate() {
        return anveragerate;
    }

    public void setAnveragerate(String anveragerate) {
        this.anveragerate = anveragerate == null ? null : anveragerate.trim();
    }
}