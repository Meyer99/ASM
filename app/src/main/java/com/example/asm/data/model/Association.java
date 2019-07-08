package com.example.asm.data.model;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.util.ArrayList;
import java.util.List;

public class Association extends LitePalSupport {

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String setupData;

    private String description;

    private List<User> membersFee = new ArrayList<User>();

    private String flagPath;

    private String badgePath;

    public void setName(String name) {
        this.name = name;
    }

    public void setSetupData(String setupData) {
        this.setupData = setupData;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMenmbersFee(List<User> menmbersFee) {
        this.membersFee = menmbersFee;
    }

    public void setFlagPath(String flagPath) {
        this.flagPath = flagPath;
    }

    public void setBadgePath(String badgePath) {
        this.badgePath = badgePath;
    }

    public String getName() {
        return name;
    }

    public String getSetupData() {
        return setupData;
    }

    public String getDescription() {
        return description;
    }

    public List<User> getMenmbersFee() {
        return membersFee;
    }

    public String getFlagPath() {
        return flagPath;
    }

    public String getBadgePath() {
        return badgePath;
    }
}
