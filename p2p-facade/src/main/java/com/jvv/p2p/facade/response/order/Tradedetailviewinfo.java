package com.jvv.p2p.facade.response.order;

import java.math.BigDecimal;
import java.util.Date;

import org.xmappr.Element;

import com.jvv.p2p.facade.response.product.Demandinfot;
import com.jvv.p2p.facade.response.product.ExperienceAppDetail;
import com.jvv.p2p.facade.response.product.Trade;

public class Tradedetailviewinfo {

	@Element("trade_id")
	private Integer tradeId;
	@Element("code")
	private String code;
	@Element("demand_id")
	private Integer demandId;
	@Element("trade_name")
	private String tradeName;
	@Element("time_limit_unit")
	private String timeLimitUnit;

	@Element("time_limit")
	private Integer timeLimit;
	@Element("invest_amount")
	private BigDecimal investAmount;
	@Element(name = "invest_time", format = "yyyy-MM-dd")
	private Date investTime;
	@Element(name = "trade_expire_date", format = "yyyy/MM/dd HH:mm:ss")
	private Date tradeExpireDate;
	@Element("trade_status")
	private String tradeStatus;

	@Element("charge_status")
	private Integer chargeStatus;
	@Element("profit")
	private BigDecimal profit;
	@Element("status")
	private Integer status;
	@Element("detail_id")
	private Integer detailId;
	@Element("detail_status")
	private Integer detailStatus;

	@Element("detail_contract_no")
	private String detailContractNo;
	@Element(name = "trade_effective_date", format = "yyyy/MM/dd HH:mm:ss")
	private Date tradeEffectiveDate;

	@Element("ysjy_rate")
	private Integer ysjyRate;
	@Element("zrjy_rate")
	private Integer zrjyRate;
	@Element("zrcapital")
	private Integer zrcapital;

	@Element("investor_id")
	private Integer investorId;
	@Element("pay_bill_type")
	private Integer payBillType;
	@Element("ystradeid")
	private Integer ystradeid;

	@Element("is_transfer")
	private Integer isTransfer;
	@Element("source")
	private Integer source;
	@Element("iscreatecontract")
	private Integer iscreatecontract;

	@Element("strsy")
	private String strsy;
	@Element("strqxts")
	private String strqxts;
	@Element("strdqsj")
	private String strdqsj;
	@Element("strxmjd")
	private String strxmjd;
	@Element("isdown_repay")
	private String isdownRepay;

	//vo
	private Trade trade;
	private Demandinfot demandinfot;
	private ExperienceAppDetail experienceApp;
	public ExperienceAppDetail getExperienceApp() {
		return experienceApp;
	}

	public void setExperienceApp(ExperienceAppDetail experienceApp) {
		this.experienceApp = experienceApp;
	}

	public String getStrsy() {
		return strsy;
	}

	public void setStrsy(String strsy) {
		this.strsy = strsy;
	}

	public String getStrqxts() {
		return strqxts;
	}

	public void setStrqxts(String strqxts) {
		this.strqxts = strqxts;
	}

	public String getStrdqsj() {
		return strdqsj;
	}

	public void setStrdqsj(String strdqsj) {
		this.strdqsj = strdqsj;
	}

	public String getStrxmjd() {
		return strxmjd;
	}

	public void setStrxmjd(String strxmjd) {
		this.strxmjd = strxmjd;
	}

	public String getIsdownRepay() {
		return isdownRepay;
	}

	public void setIsdownRepay(String isdownRepay) {
		this.isdownRepay = isdownRepay;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
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

	public BigDecimal getInvestAmount() {
		return investAmount;
	}

	public void setInvestAmount(BigDecimal investAmount) {
		this.investAmount = investAmount;
	}

	public Date getInvestTime() {
		return investTime;
	}

	public void setInvestTime(Date investTime) {
		this.investTime = investTime;
	}

	public Date getTradeExpireDate() {
		return tradeExpireDate;
	}

	public void setTradeExpireDate(Date tradeExpireDate) {
		this.tradeExpireDate = tradeExpireDate;
	}

	public String getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public Integer getChargeStatus() {
		return chargeStatus;
	}

	public void setChargeStatus(Integer chargeStatus) {
		this.chargeStatus = chargeStatus;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDetailId() {
		return detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Integer getDetailStatus() {
		return detailStatus;
	}

	public void setDetailStatus(Integer detailStatus) {
		this.detailStatus = detailStatus;
	}

	public String getDetailContractNo() {
		return detailContractNo;
	}

	public void setDetailContractNo(String detailContractNo) {
		this.detailContractNo = detailContractNo;
	}

	public Date getTradeEffectiveDate() {
		return tradeEffectiveDate;
	}

	public void setTradeEffectiveDate(Date tradeEffectiveDate) {
		this.tradeEffectiveDate = tradeEffectiveDate;
	}

	public Integer getYsjyRate() {
		return ysjyRate;
	}

	public void setYsjyRate(Integer ysjyRate) {
		this.ysjyRate = ysjyRate;
	}

	public Integer getZrjyRate() {
		return zrjyRate;
	}

	public void setZrjyRate(Integer zrjyRate) {
		this.zrjyRate = zrjyRate;
	}

	public Integer getZrcapital() {
		return zrcapital;
	}

	public void setZrcapital(Integer zrcapital) {
		this.zrcapital = zrcapital;
	}

	public Integer getInvestorId() {
		return investorId;
	}

	public void setInvestorId(Integer investorId) {
		this.investorId = investorId;
	}

	public Integer getPayBillType() {
		return payBillType;
	}

	public void setPayBillType(Integer payBillType) {
		this.payBillType = payBillType;
	}

	public Integer getYstradeid() {
		return ystradeid;
	}

	public void setYstradeid(Integer ystradeid) {
		this.ystradeid = ystradeid;
	}

	public Integer getIsTransfer() {
		return isTransfer;
	}

	public void setIsTransfer(Integer isTransfer) {
		this.isTransfer = isTransfer;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getIscreatecontract() {
		return iscreatecontract;
	}

	public void setIscreatecontract(Integer iscreatecontract) {
		this.iscreatecontract = iscreatecontract;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(Trade trade) {
		this.trade = trade;
	}

	public Demandinfot getDemandinfot() {
		return demandinfot;
	}

	public void setDemandinfot(Demandinfot demandinfot) {
		this.demandinfot = demandinfot;
	}

}
