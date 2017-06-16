package com.jvv.p2p.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TradeFlowDto {
    private String id;

    private String orderId;

    private String extUserId;

    private String redpacketid;

    private Date createtime;

    private BigDecimal amount;

    private String extTradeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getExtUserId() {
        return extUserId;
    }

    public void setExtUserId(String extUserId) {
        this.extUserId = extUserId;
    }

    public String getRedpacketid() {
        return redpacketid;
    }

    public void setRedpacketid(String redpacketid) {
        this.redpacketid = redpacketid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getExtTradeId() {
        return extTradeId;
    }

    public void setExtTradeId(String extTradeId) {
        this.extTradeId = extTradeId;
    }
}