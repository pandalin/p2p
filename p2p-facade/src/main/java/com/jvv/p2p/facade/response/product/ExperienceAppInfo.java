package com.jvv.p2p.facade.response.product;



import java.math.BigDecimal;


import org.xmappr.Element;


public class ExperienceAppInfo {
	@Element("id")
	private Integer id;
	@Element("percent")
	private String percent;
	@Element("disable")
	private Boolean disable;
	@Element("loan_amount_str")
	private String loanAmount;
	@Element("invested_amount_str")
	private String investedAmount;
	@Element("str_max_invest_amount")
	private String maxInvestAmount;
	@Element("str_least_invest_amount")
	private String leastInvestAmount;
	@Element("str_hkfs")
	private String strHkfs;
	@Element("can_invest_amount")
	private String canInvestAmount;
	@Element("strjkqx")
	private String strjkqx;
	@Element("pay_type")
	private String payType;
	@Element("code")
	private String code;
	@Element("loan_name")
	private String loanName;
	@Element("trade_status")
	private Integer tradeStatus;
	@Element("time_limit")
	private Integer timeLimit;
	@Element("time_limit_unit")
	private String timeLimitUnit;
	@Element("interest_rate")
	private BigDecimal interestRate;
	@Element("self_rate")
	private BigDecimal selfRate;
	@Element("self_defined_rate")
	private BigDecimal selfDefinedRate;
	@Element("invest_start_date")
	private String investStartDate;
	@Element("trade_effective_date")
	private String tradeEffectiveDate;
	@Element("trade_expire_date")
	private String tradeExpireDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}
	public Boolean getDisable() {
		return disable;
	}
	public void setDisable(Boolean disable) {
		this.disable = disable;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getInvestedAmount() {
		return investedAmount;
	}
	public void setInvestedAmount(String investedAmount) {
		this.investedAmount = investedAmount;
	}
	public String getMaxInvestAmount() {
		return maxInvestAmount;
	}
	public void setMaxInvestAmount(String maxInvestAmount) {
		this.maxInvestAmount = maxInvestAmount;
	}
	public String getLeastInvestAmount() {
		return leastInvestAmount;
	}
	public void setLeastInvestAmount(String leastInvestAmount) {
		this.leastInvestAmount = leastInvestAmount;
	}
	public String getStrHkfs() {
		return strHkfs;
	}
	public void setStrHkfs(String strHkfs) {
		this.strHkfs = strHkfs;
	}
	public String getCanInvestAmount() {
		return canInvestAmount;
	}
	public void setCanInvestAmount(String canInvestAmount) {
		this.canInvestAmount = canInvestAmount;
	}
	public String getStrjkqx() {
		return strjkqx;
	}
	public void setStrjkqx(String strjkqx) {
		this.strjkqx = strjkqx;
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
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public Integer getTradeStatus() {
		return tradeStatus;
	}
	public void setTradeStatus(Integer tradeStatus) {
		this.tradeStatus = tradeStatus;
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
}
