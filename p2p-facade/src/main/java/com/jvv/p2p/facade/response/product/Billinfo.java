package com.jvv.p2p.facade.response.product;

import java.math.BigDecimal;
import java.util.Date;

import org.xmappr.Element;

public class Billinfo {

	@Element("strhkzt")
	private String strhkzt;
	@Element("id")
	private Integer id;
	@Element("code")
	private String code;
	@Element("project_id")
	private Integer projectId;
	@Element("trade_id")
	private Integer tradeId;

	@Element("total_amount")
	private BigDecimal totalAmount;
	@Element("principal_amount")
	private BigDecimal principalAmount;
	@Element("interest_amount")
	private BigDecimal interestAmount;
	@Element("overdue_amount")
	private BigDecimal overdueAmount;
	@Element("pay_amount")
	private BigDecimal payAmount;

	@Element(name = "end_pay_time", format = "yyyy/MM/dd HH:mm:ss")
	private Date endPayTime;
	@Element("bill_no")
	private String bill_no;
	@Element(name = "create_time", format = "yyyy/MM/dd HH:mm:ss")
	private Date createTime;
	@Element("status")
	private Integer status;
	@Element(name = "bill_plan_date", format = "yyyy-MM-dd")
	private Date billPlanDate;

	@Element("bill_type")
	private Integer bill_type;
	@Element("detail_id")
	private Integer detail_id;
	@Element("detail_status")
	private Integer detail_status;
	
	@Element(name="detail_time", format = "yyyy/MM/dd HH:mm:ss")
	private Date detail_time;
	
	@Element("bill_days")
	private Integer bill_days;

	@Element("is_division")
	private Integer isDivision;
	@Element("credit_is_division")
	private Integer creditIsDivision;

	public String getStrhkzt() {
		return strhkzt;
	}

	public void setStrhkzt(String strhkzt) {
		this.strhkzt = strhkzt;
	}

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

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(BigDecimal principalAmount) {
		this.principalAmount = principalAmount;
	}

	public BigDecimal getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(BigDecimal interestAmount) {
		this.interestAmount = interestAmount;
	}

	public BigDecimal getOverdueAmount() {
		return overdueAmount;
	}

	public void setOverdueAmount(BigDecimal overdueAmount) {
		this.overdueAmount = overdueAmount;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public Date getEndPayTime() {
		return endPayTime;
	}

	public void setEndPayTime(Date endPayTime) {
		this.endPayTime = endPayTime;
	}

	public String getBill_no() {
		return bill_no;
	}

	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
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

	public Date getBillPlanDate() {
		return billPlanDate;
	}

	public void setBillPlanDate(Date billPlanDate) {
		this.billPlanDate = billPlanDate;
	}

	public Integer getBill_type() {
		return bill_type;
	}

	public void setBill_type(Integer bill_type) {
		this.bill_type = bill_type;
	}

	public Integer getDetail_id() {
		return detail_id;
	}

	public void setDetail_id(Integer detail_id) {
		this.detail_id = detail_id;
	}

	public Integer getDetail_status() {
		return detail_status;
	}

	public void setDetail_status(Integer detail_status) {
		this.detail_status = detail_status;
	}

	public Date getDetail_time() {
		return detail_time;
	}

	public void setDetail_time(Date detail_time) {
		this.detail_time = detail_time;
	}

	public Integer getBill_days() {
		return bill_days;
	}

	public void setBill_days(Integer bill_days) {
		this.bill_days = bill_days;
	}

	public Integer getIsDivision() {
		return isDivision;
	}

	public void setIsDivision(Integer isDivision) {
		this.isDivision = isDivision;
	}

	public Integer getCreditIsDivision() {
		return creditIsDivision;
	}

	public void setCreditIsDivision(Integer creditIsDivision) {
		this.creditIsDivision = creditIsDivision;
	}

}
