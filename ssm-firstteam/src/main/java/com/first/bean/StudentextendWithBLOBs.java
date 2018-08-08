package com.first.bean;

public class StudentextendWithBLOBs extends Studentextend {
    private String specialty;

    private String intershipexperience;

    private String getwinning;

    private String evaluation;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getIntershipexperience() {
        return intershipexperience;
    }

    public void setIntershipexperience(String intershipexperience) {
        this.intershipexperience = intershipexperience == null ? null : intershipexperience.trim();
    }

    public String getGetwinning() {
        return getwinning;
    }

    public void setGetwinning(String getwinning) {
        this.getwinning = getwinning == null ? null : getwinning.trim();
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation == null ? null : evaluation.trim();
    }
}