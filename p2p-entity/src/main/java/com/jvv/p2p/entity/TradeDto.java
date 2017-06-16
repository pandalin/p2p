package com.jvv.p2p.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -9197043398246184808L;

	private String id;

    private Date createTime;

    private Date updateTime;

    private String chanelId;

    private Integer extId;

    private String code;

    private Integer demandId;

    private String tradeName;

    private Long tradeAmount;

    private BigDecimal perlen;

    private BigDecimal interestRate;

    private Long leastInvestAmount;

    private Long investedAmount;

    private String saturationConditionMethod;

    private Long saturationCondition;

    private String timeLimitUnit;

    private Integer timeLimit;

    private Date investStartDate;

    private Date investEndDate;

    private Date tradeExpireDate;

    private Date tradeEffectiveDate;

    private Date tradeFinishDate;

    private Date extCreateTime;

    private Integer status;

    private Long iscreatecontract;

    private Short isPayed;

    private Short allowDeferDay;

    private Short monthBillDay;

    private Integer tradeStatus;

    private Short chargeStatus;

    private String bizType;

    private Short payBillType;

    private Integer loanerId;

    private Integer guaranteeId;

    private Long maxInvestAmount;

    private String isinvest;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getChanelId() {
        return chanelId;
    }

    public void setChanelId(String chanelId) {
        this.chanelId = chanelId;
    }

    public Integer getExtId() {
        return extId;
    }

    public void setExtId(Integer extId) {
        this.extId = extId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
    	this.code = code;
    }

    public Integer getDemandId() {
        return demandId;
    }

    public void setDemandId(Integer demandId) {
        this.demandId = demandId;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public Long getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Long tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public BigDecimal getPerlen() {
        return perlen;
    }

    public void setPerlen(BigDecimal perlen) {
        this.perlen = perlen;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public Long getLeastInvestAmount() {
        return leastInvestAmount;
    }

    public void setLeastInvestAmount(Long leastInvestAmount) {
        this.leastInvestAmount = leastInvestAmount;
    }

    public Long getInvestedAmount() {
        return investedAmount;
    }

    public void setInvestedAmount(Long investedAmount) {
        this.investedAmount = investedAmount;
    }

    public String getSaturationConditionMethod() {
        return saturationConditionMethod;
    }

    public void setSaturationConditionMethod(String saturationConditionMethod) {
        this.saturationConditionMethod = saturationConditionMethod;
    }

    public Long getSaturationCondition() {
        return saturationCondition;
    }

    public void setSaturationCondition(Long saturationCondition) {
        this.saturationCondition = saturationCondition;
    }

    public String getTimeLimitUnit() {
        return timeLimitUnit;
    }

    public void setTimeLimitUnit(String timeLimitUnit) {
        this.timeLimitUnit = timeLimitUnit;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Date getInvestStartDate() {
        return investStartDate;
    }

    public void setInvestStartDate(Date investStartDate) {
        this.investStartDate = investStartDate;
    }

    public Date getInvestEndDate() {
        return investEndDate;
    }

    public void setInvestEndDate(Date investEndDate) {
        this.investEndDate = investEndDate;
    }

    public Date getTradeExpireDate() {
        return tradeExpireDate;
    }

    public void setTradeExpireDate(Date tradeExpireDate) {
        this.tradeExpireDate = tradeExpireDate;
    }

    public Date getTradeEffectiveDate() {
        return tradeEffectiveDate;
    }

    public void setTradeEffectiveDate(Date tradeEffectiveDate) {
        this.tradeEffectiveDate = tradeEffectiveDate;
    }

    public Date getTradeFinishDate() {
        return tradeFinishDate;
    }

    public void setTradeFinishDate(Date tradeFinishDate) {
        this.tradeFinishDate = tradeFinishDate;
    }

    public Date getExtCreateTime() {
        return extCreateTime;
    }

    public void setExtCreateTime(Date extCreateTime) {
        this.extCreateTime = extCreateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getIscreatecontract() {
        return iscreatecontract;
    }

    public void setIscreatecontract(Long iscreatecontract) {
        this.iscreatecontract = iscreatecontract;
    }

    public Short getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(Short isPayed) {
        this.isPayed = isPayed;
    }

    public Short getAllowDeferDay() {
        return allowDeferDay;
    }

    public void setAllowDeferDay(Short allowDeferDay) {
        this.allowDeferDay = allowDeferDay;
    }

    public Short getMonthBillDay() {
        return monthBillDay;
    }

    public void setMonthBillDay(Short monthBillDay) {
        this.monthBillDay = monthBillDay;
    }

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Short getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(Short chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public Short getPayBillType() {
        return payBillType;
    }

    public void setPayBillType(Short payBillType) {
        this.payBillType = payBillType;
    }

    public Integer getLoanerId() {
        return loanerId;
    }

    public void setLoanerId(Integer loanerId) {
        this.loanerId = loanerId;
    }

    public Integer getGuaranteeId() {
        return guaranteeId;
    }

    public void setGuaranteeId(Integer guaranteeId) {
        this.guaranteeId = guaranteeId;
    }

    public Long getMaxInvestAmount() {
        return maxInvestAmount;
    }

    public void setMaxInvestAmount(Long maxInvestAmount) {
        this.maxInvestAmount = maxInvestAmount;
    }

    public String getIsinvest() {
        return isinvest;
    }

    public void setIsinvest(String isinvest) {
        this.isinvest = isinvest;
    }
}