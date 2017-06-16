package com.jvv.p2p.facade.response.product;

import java.math.BigDecimal;
import java.util.Date;

import org.xmappr.Element;

public class Demandinfot {

	@Element
	private Integer id;

	@Element("pay_type")
	private String payType;

	@Element("code")
	private String code;

	@Element("loaner_id")
	private Integer loanerId;
	
	@Element("self_rate")
	private BigDecimal selfRate;
	
	@Element("self_defined_title")
	private String selfDefinedTitle;

	@Element("loan_name")
	private String loanName;

	@Element("dimensions")
	private String dimensions;

	@Element("loan_amount")
	private BigDecimal loanAmount;

	@Element("loan_rate")
	private BigDecimal loanRate;

	@Element("interest_rate")
	private BigDecimal interestRate;

	@Element("time_limit_unit")
	private String timeLimitUnit;

	@Element("time_limit")
	private Integer timeLimit;

	@Element("least_invest_amount")
	private BigDecimal leastInvestAmount;

	@Element("saturation_condition_method")
	private String saturationConditionMethod;

	@Element("saturation_condition")
	private String saturationCondition;

	@Element(name = "invest_start_date", format = "yyyy/MM/dd HH:mm:ss")
	private Date investStartDate;

	@Element(name = "invest_end_date", format = "yyyy/MM/dd HH:mm:ss")
	private Date investEndDate;

	@Element("guarantee_id")
	private Integer guaranteeId;

	@Element("division_tmp_id")
	private Integer divisionTmpDd;

	@Element("status")
	private Integer status;

	@Element("create_userid")
	private Integer createUserid;

	@Element(name = "create_time", format = "yyyy/MM/dd HH:mm:ss")
	private Date createTime;

	@Element(name = "update_time", format = "yyyy/MM/dd HH:mm:ss")
	private Date updateTime;

	@Element("isvalid")
	private Integer isvalid;

	@Element(name = "publish_time", format = "yyyy/MM/dd HH:mm:ss")
	private Date publishTime;

	@Element("allow_defer_day")
	private Integer allowDeferDay;

	@Element("biz_type")
	private String bizType;

	@Element("pay_bill_type")
	private Integer payBillType;

	@Element("username")
	private String username;

	@Element("realname")
	private String realname;

	@Element("max_invest_amount")
	private BigDecimal maxInvestAmount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(Integer timeLimit) {
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

	public Integer getDivisionTmpDd() {
		return divisionTmpDd;
	}

	public void setDivisionTmpDd(Integer divisionTmpDd) {
		this.divisionTmpDd = divisionTmpDd;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
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

	public Integer getPayBillType() {
		return payBillType;
	}

	public void setPayBillType(Integer payBillType) {
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

	public String getSelfDefinedTitle() {
		return selfDefinedTitle;
	}

	public void setSelfDefinedTitle(String selfDefinedTitle) {
		this.selfDefinedTitle = selfDefinedTitle;
	}

	public BigDecimal getSelfRate() {
		return selfRate;
	}

	public void setSelfRate(BigDecimal selfRate) {
		this.selfRate = selfRate;
	}

}
