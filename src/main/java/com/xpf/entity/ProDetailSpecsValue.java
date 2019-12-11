package com.xpf.entity;

import java.math.BigDecimal;

public class ProDetailSpecsValue {
    private Integer pdsvId;

    private Integer pdId;

    private Integer svId;

    private BigDecimal price;

    private Integer proNum;

    public Integer getPdsvId() {
        return pdsvId;
    }

    public void setPdsvId(Integer pdsvId) {
        this.pdsvId = pdsvId;
    }

    public Integer getPdId() {
        return pdId;
    }

    public void setPdId(Integer pdId) {
        this.pdId = pdId;
    }

    public Integer getSvId() {
        return svId;
    }

    public void setSvId(Integer svId) {
        this.svId = svId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getProNum() {
        return proNum;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }
}