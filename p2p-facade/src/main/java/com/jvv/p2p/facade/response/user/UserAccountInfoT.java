package com.jvv.p2p.facade.response.user;

import java.math.BigDecimal;
import java.util.Date;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

/**
 * Created by cx on 2015/5/27.
 */
@RootElement("useraccountinfot")
public class UserAccountInfoT {

	
	@Element
	private Integer id;

	@Element("user_id")
	private Integer userId;

	@Element("pay_type")
	private String payType;

	@Element("is_bind_email")
	private Boolean bindEmail;

	@Element("is_chek_realname")
	private Boolean chekRealname;

	@Element("is_bind_phone")
	private Boolean bindPhone;

	@Element("is_bind_bank")
	private Boolean bindBank;

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

	@Element("is_set_pay_pwd")
	private Integer isSetPayPwd;//是否设置支付密码，1  已设置  0未设置

	@Element("account_type")
	private Integer accountType;

	@Element("withdraw_amount")
	private BigDecimal withdrawAmount;

	
	transient private Result result;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Boolean getBindEmail() {
		return bindEmail;
	}

	public void setBindEmail(Boolean bindEmail) {
		this.bindEmail = bindEmail;
	}

	public Boolean getChekRealname() {
		return chekRealname;
	}

	public void setChekRealname(Boolean chekRealname) {
		this.chekRealname = chekRealname;
	}

	public Boolean getBindPhone() {
		return bindPhone;
	}

	public void setBindPhone(Boolean bindPhone) {
		this.bindPhone = bindPhone;
	}

	public Boolean getBindBank() {
		return bindBank;
	}

	public void setBindBank(Boolean bindBank) {
		this.bindBank = bindBank;
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

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public BigDecimal getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(BigDecimal withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public Integer getIsSetPayPwd() {
		return isSetPayPwd;
	}

	public void setIsSetPayPwd(Integer isSetPayPwd) {
		this.isSetPayPwd = isSetPayPwd;
	}
}
