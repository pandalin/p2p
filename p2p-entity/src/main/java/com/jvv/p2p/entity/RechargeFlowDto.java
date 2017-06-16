package com.jvv.p2p.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RechargeFlowDto {
    private String id;

    private String extUserId;

    private BigDecimal amonut;

    private Date createtime;

    private String extFlowno;

    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExtUserId() {
        return extUserId;
    }

    public void setExtUserId(String extUserId) {
        this.extUserId = extUserId;
    }

    public BigDecimal getAmonut() {
        return amonut;
    }

    public void setAmonut(BigDecimal amonut) {
        this.amonut = amonut;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getExtFlowno() {
        return extFlowno;
    }

    public void setExtFlowno(String extFlowno) {
        this.extFlowno = extFlowno;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}