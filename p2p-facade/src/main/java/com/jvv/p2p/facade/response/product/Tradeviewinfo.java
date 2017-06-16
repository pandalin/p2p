package com.jvv.p2p.facade.response.product;

import java.math.BigDecimal;
import java.util.Date;

import org.xmappr.Element;

public class Tradeviewinfo {

	@Element
	private Integer id;

	@Element
	private String code;

	@Element("demand_id")
	private Integer demandId;

	@Element("trade_name")
	private String tradeName;

	@Element("self_rate")
	private BigDecimal selfRate;

	@Element("TAGName")
	private String tagName;

	@Element("trade_amount")
	private BigDecimal tradeAmount;

	@Element("interest_rate")
	private BigDecimal interestRate;

	@Element("least_invest_amount")
	private BigDecimal leastInvestAmount;

	@Element("invested_amount")
	private BigDecimal investedAmount;

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

	@Element("status")
	private Integer status;

	@Element("iscreatecontract")
	private Integer iscreatecontract;

	@Element("username")
	private String username;

	@Element("realname")
	private String realname;

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

	@Element("guarantee_name")
	private String guaranteeName;

	@Element("jgjm")
	private String jgjm;

	@Element("ent_short_name")
	private String entShortName;

	@Element("ent_organprop_code")
	private String entOrganpropCode;

	@Element("self_defined_title")
	private String selfDefinedTitle;
	@Element("max_invest_amount")
	private BigDecimal maxInvestAmount;
	@Element("tag")
	private String tag;
	@Element("strywlx")
	private String strywlx;
	@Element("strhkfs")
	private String strhkfs;
	@Element("strjkqx")
	private String strjkqx;
	@Element("isnewstandard")
	private String isnewstandard;
	@Element("strktje")
	private String strktje;
	@Element("strbtnname")
	private String strbtnname;
	@Element("isinvest")
	private String isinvest;
	@Element("perlen")
	private Integer perlen;
	@Element("ent_organprop_code_name")
	private String entOrganpropCodeName;
	@Element
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
//		if (this.getSelfRate() != null && BigDecimal.ZERO.compareTo(this.getSelfRate()) < 0) {
//			return this.getSelfRate();
//		}
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

	public String getGuaranteeName() {
		return guaranteeName;
	}

	public void setGuaranteeName(String guaranteeName) {
		this.guaranteeName = guaranteeName;
	}

	public String getJgjm() {
		return jgjm;
	}

	public void setJgjm(String jgjm) {
		this.jgjm = jgjm;
	}

	public String getEntShortName() {
		return entShortName;
	}

	public void setEntShortName(String entShortName) {
		this.entShortName = entShortName;
	}

	public String getEntOrganpropCode() {
		return entOrganpropCode;
	}

	public void setEntOrganpropCode(String entOrganpropCode) {
		this.entOrganpropCode = entOrganpropCode;
	}

	public String getSelfDefinedTitle() {
		return selfDefinedTitle;
	}

	public void setSelfDefinedTitle(String selfDefinedTitle) {
		this.selfDefinedTitle = selfDefinedTitle;
	}

	public BigDecimal getMaxInvestAmount() {
		return maxInvestAmount;
	}

	public void setMaxInvestAmount(BigDecimal maxInvestAmount) {
		this.maxInvestAmount = maxInvestAmount;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
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

	public String getIsnewstandard() {
		return isnewstandard;
	}

	public void setIsnewstandard(String isnewstandard) {
		this.isnewstandard = isnewstandard;
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

	public String getIsinvest() {
		return isinvest;
	}

	public void setIsinvest(String isinvest) {
		this.isinvest = isinvest;
	}

	public Integer getPerlen() {
		return perlen;
	}

	public void setPerlen(Integer perlen) {
		this.perlen = perlen;
	}

	public String getEntOrganpropCodeName() {
		return entOrganpropCodeName;
	}

	public void setEntOrganpropCodeName(String entOrganpropCodeName) {
		this.entOrganpropCodeName = entOrganpropCodeName;
	}

	public Integer getBtnstyle() {
		return btnstyle;
	}

	public void setBtnstyle(Integer btnstyle) {
		this.btnstyle = btnstyle;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public BigDecimal getSelfRate() {
		return selfRate;
	}

	public void setSelfRate(BigDecimal selfRate) {
		this.selfRate = selfRate;
	}
}
