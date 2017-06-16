package com.jvv.p2p.facade.response.order;

import java.math.BigDecimal;

import org.xmappr.Element;

public class Divisioninfo {

	@Element("id")
	private Integer id;
	@Element("trade_id")
	private Integer tradeId;
	@Element("detail_id")
	private Integer detailId;
	@Element("user_id")
	private Integer userId;
	@Element("role_id")
	private Integer roleId;

	@Element("division_rate")
	private BigDecimal divisionRate;
	@Element("amount")
	private BigDecimal amount;
	@Element("transfer_phase")
	private Integer transferPhase;
	@Element("profit_type")
	private Integer profitType;
	@Element(name = "create_time", format = "yyyy/MM/dd HH:mm:ss")
	private Integer createTime;

	@Element("tradetemplate_id")
	private Integer tradetemplateId;
	@Element("user_tradetemplate_id")
	private Integer userTradetemplateId;
	@Element("btrade_name")
	private Integer btradeName;
	@Element(name = "ccreate_time", format = "yyyy/MM/dd HH:mm:ss")
	private Integer ccreateTime;
	@Element(name = "cupdate_time", format = "yyyy/MM/dd HH:mm:ss")
	private Integer cupdateTime;

	@Element("tzmoney")
	private Integer tzmoney;
	@Element("status")
	private Integer status;
	@Element("usertype")
	private Integer usertype;
	@Element("ispayed")
	private Integer ispayed;
	@Element("investor_id")
	private Integer investorId;

	@Element("detail_code")
	private String detailCode;
	@Element("detail_contract_no")
	private String detailContractNo;

	@Element(name = "dcreate_time", format = "yyyy/MM/dd HH:mm:ss")
	private Integer dcreateTime;
	@Element(name = "transfer_plan_date", format = "yyyy/MM/dd HH:mm:ss")
	private Integer transferPlanDate;
	@Element("bill_days")
	private Integer billDays;
	@Element("trade_type")
	private String tradetype;

	@Element("getrepay_remark")
	private String getrepayRemark;
	@Element("getrepay_status")
	private Integer getrepayStatus;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTradeId() {
		return tradeId;
	}
	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}
	public Integer getDetailId() {
		return detailId;
	}
	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public BigDecimal getDivisionRate() {
		return divisionRate;
	}
	public void setDivisionRate(BigDecimal divisionRate) {
		this.divisionRate = divisionRate;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Integer getTransferPhase() {
		return transferPhase;
	}
	public void setTransferPhase(Integer transferPhase) {
		this.transferPhase = transferPhase;
	}
	public Integer getProfitType() {
		return profitType;
	}
	public void setProfitType(Integer profitType) {
		this.profitType = profitType;
	}
	public Integer getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}
	public Integer getTradetemplateId() {
		return tradetemplateId;
	}
	public void setTradetemplateId(Integer tradetemplateId) {
		this.tradetemplateId = tradetemplateId;
	}
	public Integer getUserTradetemplateId() {
		return userTradetemplateId;
	}
	public void setUserTradetemplateId(Integer userTradetemplateId) {
		this.userTradetemplateId = userTradetemplateId;
	}
	public Integer getBtradeName() {
		return btradeName;
	}
	public void setBtradeName(Integer btradeName) {
		this.btradeName = btradeName;
	}
	public Integer getCcreateTime() {
		return ccreateTime;
	}
	public void setCcreateTime(Integer ccreateTime) {
		this.ccreateTime = ccreateTime;
	}
	public Integer getCupdateTime() {
		return cupdateTime;
	}
	public void setCupdateTime(Integer cupdateTime) {
		this.cupdateTime = cupdateTime;
	}
	public Integer getTzmoney() {
		return tzmoney;
	}
	public void setTzmoney(Integer tzmoney) {
		this.tzmoney = tzmoney;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getUsertype() {
		return usertype;
	}
	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}
	public Integer getIspayed() {
		return ispayed;
	}
	public void setIspayed(Integer ispayed) {
		this.ispayed = ispayed;
	}
	public Integer getInvestorId() {
		return investorId;
	}
	public void setInvestorId(Integer investorId) {
		this.investorId = investorId;
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
	public Integer getDcreateTime() {
		return dcreateTime;
	}
	public void setDcreateTime(Integer dcreateTime) {
		this.dcreateTime = dcreateTime;
	}
	public Integer getTransferPlanDate() {
		return transferPlanDate;
	}
	public void setTransferPlanDate(Integer transferPlanDate) {
		this.transferPlanDate = transferPlanDate;
	}
	public Integer getBillDays() {
		return billDays;
	}
	public void setBillDays(Integer billDays) {
		this.billDays = billDays;
	}
	public String getTradetype() {
		return tradetype;
	}
	public void setTradetype(String tradetype) {
		this.tradetype = tradetype;
	}
	public String getGetrepayRemark() {
		return getrepayRemark;
	}
	public void setGetrepayRemark(String getrepayRemark) {
		this.getrepayRemark = getrepayRemark;
	}
	public Integer getGetrepayStatus() {
		return getrepayStatus;
	}
	public void setGetrepayStatus(Integer getrepayStatus) {
		this.getrepayStatus = getrepayStatus;
	}

}
