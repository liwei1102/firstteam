package com.first.bean;

import java.io.Serializable;

public class Stuoverheadinfo implements Serializable{
    private Integer stuid;

    private Integer score;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}