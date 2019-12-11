package com.xpf.entity;

public class Specifications {
    private Integer sid;

    private String specsName;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSpecsName() {
        return specsName;
    }

    public void setSpecsName(String specsName) {
        this.specsName = specsName == null ? null : specsName.trim();
    }
}