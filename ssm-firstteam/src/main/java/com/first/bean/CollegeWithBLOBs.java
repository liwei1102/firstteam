package com.first.bean;

public class CollegeWithBLOBs extends College {
    private String introduction;

    private String aims;

    private String talenttrainingplan;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getAims() {
        return aims;
    }

    public void setAims(String aims) {
        this.aims = aims == null ? null : aims.trim();
    }

    public String getTalenttrainingplan() {
        return talenttrainingplan;
    }

    public void setTalenttrainingplan(String talenttrainingplan) {
        this.talenttrainingplan = talenttrainingplan == null ? null : talenttrainingplan.trim();
    }
}