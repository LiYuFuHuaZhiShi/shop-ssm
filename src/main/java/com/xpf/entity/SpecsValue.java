package com.xpf.entity;

public class SpecsValue {
    private Integer svId;

    private String specsValue;

    private Integer sid;

    public Integer getSvId() {
        return svId;
    }

    public void setSvId(Integer svId) {
        this.svId = svId;
    }

    public String getSpecsValue() {
        return specsValue;
    }

    public void setSpecsValue(String specsValue) {
        this.specsValue = specsValue == null ? null : specsValue.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}