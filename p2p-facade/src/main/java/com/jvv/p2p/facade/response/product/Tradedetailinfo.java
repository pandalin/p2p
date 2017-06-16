package com.jvv.p2p.facade.response.product;

import java.math.BigDecimal;
import java.util.Date;

import org.xmappr.Element;

public class Tradedetailinfo {

	@Element
	private Integer id;
	@Element("detail_code")
	private String detailCode;
	@Element("detail_contract_no")
	private String detailContractNo;
	@Element("trade_id")
	private Integer tradeId;
	@Element("investor_id")
	private Integer investorId;
	@Element("investor_username")
	private String investorUsername;

	@Element("investor_realname")
	private String investorRealname;
	@Element("invest_amount")
	private BigDecimal investAmount;
	@Element(name = "create_time", format = "yyyy-MM-dd HH:mm")
	private Date createTime;

	@Element("status")
	private Integer status;

	@Element("user_class")
	private Integer userClass;

	@Element("trade_status")
	private Integer tradeStatus;
	@Element("charge_status")
	private Integer chargeStatus;
	@Element("global_status")
	private Integer globalStatus;
	@Element(name = "trade_effective_date", format = "yyyy/MM/dd HH:mm:ss")
	private Date tradeEffectiveDate;
	@Element("trade_statusp")
	private Integer tradeStatusp;

	@Element("is_payed")
	private Integer isPayed;
	@Element("iscreatecontract")
	private Integer iscreatecontract;

	@Element("invested_amount")
	private BigDecimal investedAmount;
	@Element("interest_rate")
	private BigDecimal interestRate;
	@Element("red_packets_id")
	private Integer redPacketsId;
	@Element("strtzzt")
	private String strtzzt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDetailCode() {
		return detailCode;
	}

	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}

	public String getDetailContractNo() {
		return detailContractNo;
	}

	public void setDetailContractNo(String detailContractNo) {
		this.detailContractNo = detailContractNo;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public Integer getInvestorId() {
		return investorId;
	}

	public void setInvestorId(Integer investorId) {
		this.investorId = investorId;
	}

	public String getInvestorUsername() {
		return investorUsername;
	}

	public void setInvestorUsername(String investorUsername) {
		this.investorUsername = investorUsername;
	}

	public String getInvestorRealname() {
		return investorRealname;
	}

	public void setInvestorRealname(String investorRealname) {
		this.investorRealname = investorRealname;
	}

	public BigDecimal getInvestAmount() {
		return investAmount;
	}

	public void setInvestAmount(BigDecimal investAmount) {
		this.investAmount = investAmount;
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

	public Integer getUserClass() {
		return userClass;
	}

	public void setUserClass(Integer userClass) {
		this.userClass = userClass;
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

	public Integer getGlobalStatus() {
		return globalStatus;
	}

	public void setGlobalStatus(Integer globalStatus) {
		this.globalStatus = globalStatus;
	}

	public Date getTradeEffectiveDate() {
		return tradeEffectiveDate;
	}

	public void setTradeEffectiveDate(Date tradeEffectiveDate) {
		this.tradeEffectiveDate = tradeEffectiveDate;
	}

	public Integer getTradeStatusp() {
		return tradeStatusp;
	}

	public void setTradeStatusp(Integer tradeStatusp) {
		this.tradeStatusp = tradeStatusp;
	}

	public Integer getIsPayed() {
		return isPayed;
	}

	public void setIsPayed(Integer isPayed) {
		this.isPayed = isPayed;
	}

	public Integer getIscreatecontract() {
		return iscreatecontract;
	}

	public void setIscreatecontract(Integer iscreatecontract) {
		this.iscreatecontract = iscreatecontract;
	}

	public BigDecimal getInvestedAmount() {
		return investedAmount;
	}

	public void setInvestedAmount(BigDecimal investedAmount) {
		this.investedAmount = investedAmount;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public Integer getRedPacketsId() {
		return redPacketsId;
	}

	public void setRedPacketsId(Integer redPacketsId) {
		this.redPacketsId = redPacketsId;
	}

	public String getStrtzzt() {
		return strtzzt;
	}

	public void setStrtzzt(String strtzzt) {
		this.strtzzt = strtzzt;
	}

}
