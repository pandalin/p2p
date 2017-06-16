package com.jvv.p2p.facade.response.product;

import java.math.BigDecimal;
import java.util.Date;

import org.xmappr.Element;

public class Trade {

	@Element
	private Integer id;
	@Element
	private String code;

	@Element("demand_id")
	private Integer demandId;

	@Element("trade_name")
	private String tradeName;

	@Element("trade_amount")
	private BigDecimal tradeAmount;
	@Element("interest_rate")
	private BigDecimal interestRate;
	@Element("least_invest_amount")
	private BigDecimal leastInvestAmount;

	@Element("invested_amount")
	private BigDecimal investedAmount;

	@Element("saturation_condition_method")
	private String saturationConditionMethod;

	@Element("saturation_condition")
	private BigDecimal saturationCondition;

	@Element("time_limit_unit")
	private String timeLimitUnit;

	@Element("time_limit")
	private Integer timeLimit;

	@Element(name = "invest_start_date", format = "yyyy-MM-dd HH:mm")
	private Date investStartDate;

	@Element(name = "invest_end_date", format = "yyyy-MM-dd HH:mm")
	private Date investEndDate;

	@Element(name = "trade_expire_date", format = "yyyy-MM-dd")
	private Date tradeExpireDate;

	@Element(name = "trade_effective_date", format = "yyyy-MM-dd")
	private Date tradeEffectiveDate;

	@Element(name = "trade_finish_date", format = "yyyy/MM/dd HH:mm:ss")
	private Date tradeFinishDate;

	@Element(name = "create_time", format = "yyyy/MM/dd HH:mm:ss")
	private Date createTime;

	@Element("status")
	private Integer status;

	@Element("iscreatecontract")
	private Integer iscreatecontract;

	@Element("is_payed")
	private Integer isPayed;

	@Element("allow_defer_day")
	private Integer allowDeferDay;

	@Element("month_bill_day")
	private Integer monthBillDay;

	@Element("trade_status")
	private Integer tradeStatus;

	@Element("charge_status")
	private Integer chargeStatus;

	@Element("biz_type")
	private String bizType;

	@Element("pay_bill_type")
	private Integer payBillType;

	@Element("loaner_id")
	private Integer loanerId;

	@Element("guarantee_id")
	private Integer guaranteeId;

	@Element("max_invest_amount")
	private BigDecimal maxInvestAmount;

	
	@Element("strywlx")
	private String strywlx;

	@Element("strhkfs")
	private String strhkfs;

	@Element("strjkqx")
	private String strjkqx;

	@Element("strktje")
	private String strktje;

	@Element("strbtnname")
	private String strbtnname;

	@Element("isinvest")
	private Boolean invest;

	@Element("perlen")
	private String perlen;

	@Element("oneauth")
	private String oneauth;

	@Element("twoauth")
	private String twoauth;

	@Element("jgjm2")
	private String jgjm2;

	@Element("jgmc")
	private String jgmc;

	@Element("mininvestamount")
	private BigDecimal mininvestamount;

	@Element("btnstyle")
	private Integer btnstyle;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public BigDecimal getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(BigDecimal tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public BigDecimal getLeastInvestAmount() {
		return leastInvestAmount;
	}

	public void setLeastInvestAmount(BigDecimal leastInvestAmount) {
		this.leastInvestAmount = leastInvestAmount;
	}

	public BigDecimal getInvestedAmount() {
		return investedAmount;
	}

	public void setInvestedAmount(BigDecimal investedAmount) {
		this.investedAmount = investedAmount;
	}

	public String getSaturationConditionMethod() {
		return saturationConditionMethod;
	}

	public void setSaturationConditionMethod(String saturationConditionMethod) {
		this.saturationConditionMethod = saturationConditionMethod;
	}

	public BigDecimal getSaturationCondition() {
		return saturationCondition;
	}

	public void setSaturationCondition(BigDecimal saturationCondition) {
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIscreatecontract() {
		return iscreatecontract;
	}

	public void setIscreatecontract(Integer iscreatecontract) {
		this.iscreatecontract = iscreatecontract;
	}

	public Integer getIsPayed() {
		return isPayed;
	}

	public void setIsPayed(Integer isPayed) {
		this.isPayed = isPayed;
	}

	public Integer getAllowDeferDay() {
		return allowDeferDay;
	}

	public void setAllowDeferDay(Integer allowDeferDay) {
		this.allowDeferDay = allowDeferDay;
	}

	public Integer getMonthBillDay() {
		return monthBillDay;
	}

	public void setMonthBillDay(Integer monthBillDay) {
		this.monthBillDay = monthBillDay;
	}

	public Integer getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(Integer tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public Integer getChargeStatus() {
		return chargeStatus;
	}

	public void setChargeStatus(Integer chargeStatus) {
		this.chargeStatus = chargeStatus;
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

	public BigDecimal getMaxInvestAmount() {
		return maxInvestAmount;
	}

	public void setMaxInvestAmount(BigDecimal maxInvestAmount) {
		this.maxInvestAmount = maxInvestAmount;
	}

	public String getStrywlx() {
		return strywlx;
	}

	public void setStrywlx(String strywlx) {
		this.strywlx = strywlx;
	}

	public String getStrhkfs() {
		return strhkfs;
	}

	public void setStrhkfs(String strhkfs) {
		this.strhkfs = strhkfs;
	}

	public String getStrjkqx() {
		return strjkqx;
	}

	public void setStrjkqx(String strjkqx) {
		this.strjkqx = strjkqx;
	}

	public String getStrktje() {
		return strktje;
	}

	public void setStrktje(String strktje) {
		this.strktje = strktje;
	}

	public String getStrbtnname() {
		return strbtnname;
	}

	public void setStrbtnname(String strbtnname) {
		this.strbtnname = strbtnname;
	}

	public Boolean getInvest() {
		return invest;
	}

	public void setInvest(Boolean invest) {
		this.invest = invest;
	}

	public String getPerlen() {
		return perlen;
	}

	public void setPerlen(String perlen) {
		this.perlen = perlen;
	}

	public String getOneauth() {
		return oneauth;
	}

	public void setOneauth(String oneauth) {
		this.oneauth = oneauth;
	}

	public String getTwoauth() {
		return twoauth;
	}

	public void setTwoauth(String twoauth) {
		this.twoauth = twoauth;
	}

	public String getJgjm2() {
		return jgjm2;
	}

	public void setJgjm2(String jgjm2) {
		this.jgjm2 = jgjm2;
	}

	public String getJgmc() {
		return jgmc;
	}

	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}

	public BigDecimal getMininvestamount() {
		return mininvestamount;
	}

	public void setMininvestamount(BigDecimal mininvestamount) {
		this.mininvestamount = mininvestamount;
	}

	public Integer getBtnstyle() {
		return btnstyle;
	}

	public void setBtnstyle(Integer btnstyle) {
		this.btnstyle = btnstyle;
	}

}
