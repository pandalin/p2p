package com.jvv.p2p.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDto {
    private String id;

    private String projectId;

    private String extUserId;

    private BigDecimal amount;

    private Date createtime;

    private String state;

    private String extTradeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getExtUserId() {
        return extUserId;
    }

    public void setExtUserId(String extUserId) {
        this.extUserId = extUserId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getExtTradeId() {
        return extTradeId;
    }

    public void setExtTradeId(String extTradeId) {
        this.extTradeId = extTradeId;
    }
}