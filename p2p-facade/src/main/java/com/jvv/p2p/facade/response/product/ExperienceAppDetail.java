package com.jvv.p2p.facade.response.product;

import java.math.BigDecimal;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("experienceappdetail")
public class ExperienceAppDetail {
	@Element("id")
	private String id;
	@Element("loan_name")
	private String loanName;
	@Element("interest_rate")
	private BigDecimal interestRate;
	@Element("self_rate")
	private BigDecimal selfRate;
	@Element("self_defined_rate")
	private BigDecimal selfDefinedRate;
	@Element("time_limit")
	private Integer timeLimit;
	@Element("time_limit_unit")
	private String timeLimitUnit;
	@Element("trade_status")
	private Integer tradeStatus;
	@Element("invest_start_date")
	private String investStartDate;
	@Element("trade_effective_date")
	private String tradeEffectiveDate;
	@Element("trade_expire_date")
	private String tradeExpireDate;
	@Element("loan_amount_str")
	private String loanAmountStr;
	@Element("loan_amount")
	private BigDecimal loanAmount;
	@Element("caninvestamount")
	private String canInvestAmount;
	@Element("invested_amount_str")
	private String investedAmountStr;
	@Element("remark")
	private String remark;
	@Element("disable")
	private Boolean disable;
	@Element("percent")
	private String percent;
	@Element("time_limit_str")
	private String timeLimitStr;
	@Element("str_hkfs")
	private String strHkfs;
	@Element("max_invest_amount")
	private BigDecimal maxInvestAmount;
	@Element("least_invest_amount")
	private BigDecimal leastInvestAmount;
	
	transient private Result result;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	public BigDecimal getSelfRate() {
		return selfRate;
	}
	public void setSelfRate(BigDecimal selfRate) {
		this.selfRate = selfRate;
	}
	public BigDecimal getSelfDefinedRate() {
		return selfDefinedRate;
	}
	public void setSelfDefinedRate(BigDecimal selfDefinedRate) {
		this.selfDefinedRate = selfDefinedRate;
	}
	public Integer getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(Integer timeLimit) {
		this.timeLimit = timeLimit;
	}
	public String getTimeLimitUnit() {
		return timeLimitUnit;
	}
	public void setTimeLimitUnit(String timeLimitUnit) {
		this.timeLimitUnit = timeLimitUnit;
	}
	public Integer getTradeStatus() {
		return tradeStatus;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public void setTradeStatus(Integer tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getInvestStartDate() {
		return investStartDate;
	}
	public void setInvestStartDate(String investStartDate) {
		this.investStartDate = investStartDate;
	}
	public String getTradeEffectiveDate() {
		return tradeEffectiveDate;
	}
	public void setTradeEffectiveDate(String tradeEffectiveDate) {
		this.tradeEffectiveDate = tradeEffectiveDate;
	}
	public String getTradeExpireDate() {
		return tradeExpireDate;
	}
	public void setTradeExpireDate(String tradeExpireDate) {
		this.tradeExpireDate = tradeExpireDate;
	}
	public String getLoanAmountStr() {
		return loanAmountStr;
	}
	public void setLoanAmountStr(String loanAmountStr) {
		this.loanAmountStr = loanAmountStr;
	}
	public BigDecimal getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getCanInvestAmount() {
		return canInvestAmount;
	}
	public void setCanInvestAmount(String canInvestAmount) {
		this.canInvestAmount = canInvestAmount;
	}
	public String getInvestedAmountStr() {
		return investedAmountStr;
	}
	public void setInvestedAmountStr(String investedAmountStr) {
		this.investedAmountStr = investedAmountStr;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Boolean getDisable() {
		return disable;
	}
	public void setDisable(Boolean disable) {
		this.disable = disable;
	}
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}
	public String getTimeLimitStr() {
		return timeLimitStr;
	}
	public void setTimeLimitStr(String timeLimitStr) {
		this.timeLimitStr = timeLimitStr;
	}
	public String getStrHkfs() {
		return strHkfs;
	}
	public void setStrHkfs(String strHkfs) {
		this.strHkfs = strHkfs;
	}
	public BigDecimal getMaxInvestAmount() {
		return maxInvestAmount;
	}
	public void setMaxInvestAmount(BigDecimal maxInvestAmount) {
		this.maxInvestAmount = maxInvestAmount;
	}
	public BigDecimal getLeastInvestAmount() {
		return leastInvestAmount;
	}
	public void setLeastInvestAmount(BigDecimal leastInvestAmount) {
		this.leastInvestAmount = leastInvestAmount;
	}
	
}
