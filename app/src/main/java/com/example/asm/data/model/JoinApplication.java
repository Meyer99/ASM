package com.example.asm.data.model;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

public class JoinApplication extends LitePalSupport {

    @Column(nullable = false)
    private Integer userId;

    @Column(nullable = false)
    private String associationName;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getAssociationName() {
        return associationName;
    }
}
