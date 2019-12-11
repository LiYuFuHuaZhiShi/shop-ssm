package com.xpf.entity;

public class ProDetail {
    private Integer pdId;

    private Integer pid;

    public Integer getPdId() {
        return pdId;
    }

    public void setPdId(Integer pdId) {
        this.pdId = pdId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "ProDetail{" +
                "pdId=" + pdId +
                ", pid=" + pid +
                '}';
    }
}