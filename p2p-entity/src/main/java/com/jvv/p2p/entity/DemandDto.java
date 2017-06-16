package com.jvv.p2p.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DemandDto {
    private String id;

    private Integer extId;

    private String payType;

    private String code;

    private Integer loanerId;

    private String selfDefinedTitle;

    private String loanName;

    private String dimensions;

    private BigDecimal loanAmount;

    private BigDecimal loanRate;

    private BigDecimal interestRate;

    private String timeLimitUnit;

    private Short timeLimit;

    private BigDecimal leastInvestAmount;

    private String saturationConditionMethod;

    private String saturationCondition;

    private Date investStartDate;

    private Date investEndDate;

    private Integer guaranteeId;

    private Integer divisionTmpId;

    private Short status;

    private Integer createUserid;

    private Date createTime;

    private Date updateTime;

    private Integer isvalid;

    private Date publishTime;

    private Integer allowDeferDay;

    private String bizType;

    private Short payBillType;

    private String username;

    private String realname;

    private BigDecimal maxInvestAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getExtId() {
        return extId;
    }

    public void setExtId(Integer extId) {
        this.extId = extId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getLoanerId() {
        return loanerId;
    }

    public void setLoanerId(Integer loanerId) {
        this.loanerId = loanerId;
    }

    public String getSelfDefinedTitle() {
        return selfDefinedTitle;
    }

    public void setSelfDefinedTitle(String selfDefinedTitle) {
        this.selfDefinedTitle = selfDefinedTitle;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public String getTimeLimitUnit() {
        return timeLimitUnit;
    }

    public void setTimeLimitUnit(String timeLimitUnit) {
        this.timeLimitUnit = timeLimitUnit;
    }

    public Short getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Short timeLimit) {
        this.timeLimit = timeLimit;
    }

    public BigDecimal getLeastInvestAmount() {
        return leastInvestAmount;
    }

    public void setLeastInvestAmount(BigDecimal leastInvestAmount) {
        this.leastInvestAmount = leastInvestAmount;
    }

    public String getSaturationConditionMethod() {
        return saturationConditionMethod;
    }

    public void setSaturationConditionMethod(String saturationConditionMethod) {
        this.saturationConditionMethod = saturationConditionMethod;
    }

    public String getSaturationCondition() {
        return saturationCondition;
    }

    public void setSaturationCondition(String saturationCondition) {
        this.saturationCondition = saturationCondition;
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

    public Integer getGuaranteeId() {
        return guaranteeId;
    }

    public void setGuaranteeId(Integer guaranteeId) {
        this.guaranteeId = guaranteeId;
    }

    public Integer getDivisionTmpId() {
        return divisionTmpId;
    }

    public void setDivisionTmpId(Integer divisionTmpId) {
        this.divisionTmpId = divisionTmpId;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
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

    public Integer getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getAllowDeferDay() {
        return allowDeferDay;
    }

    public void setAllowDeferDay(Integer allowDeferDay) {
        this.allowDeferDay = allowDeferDay;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public BigDecimal getMaxInvestAmount() {
        return maxInvestAmount;
    }

    public void setMaxInvestAmount(BigDecimal maxInvestAmount) {
        this.maxInvestAmount = maxInvestAmount;
    }
}