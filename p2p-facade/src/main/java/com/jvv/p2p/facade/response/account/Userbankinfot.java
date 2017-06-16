package com.jvv.p2p.facade.response.account;

import java.util.Date;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("userbankinfot")
public class Userbankinfot {

	@Element("id")
	private Integer id;
	@Element("user_id")
	private Integer userId;
	@Element("pay_type")
	private String payType;
	@Element("bank_code")
	private String bankCode;
	@Element("bank_name")
	private String bankName;

	@Element("bank_branch_name")
	private String bankBranchName;
	@Element("bank_account_name")
	private String bankAccountName;
	@Element("bank_card_no")
	private String bankCardNo;
	@Element("bank_card_type")
	private String bankCardType;
	@Element("bank_card_attr")
	private String bankCardAttr;

	@Element("bank_default_phone")
	private String bankDefaultPhone;
	@Element("province")
	private String province;
	@Element("city")
	private String city;
	@Element("region_code")
	private String regionCode;
	@Element("card_no")
	private String cardNo;

	@Element("card_type")
	private Integer cardType;

	@Element("status")
	private Integer status;

	@Element("create_userid")
	private Integer createUserid;

	@Element(value = "create_time", format = "yyyy/MM/dd HH:mm:ss")
	private Date createTime;

	@Element(value = "update_time", format = "yyyy/MM/dd HH:mm:ss")
	private Date updateTime;

	@Element("isvalid")
	private Integer isvalid;
	@Element("remark")
	private String remark;
	@Element("pay_card_id")
	private Integer payCardId;
	@Element("pay_card_isverify")
	private String payCardIsverify;
	@Element("request_no")
	private String requestNo;

	@Element("ticket")
	private String ticket;
	
	transient private Result result;

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

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranchName() {
		return bankBranchName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankCardType() {
		return bankCardType;
	}

	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getBankCardAttr() {
		return bankCardAttr;
	}

	public void setBankCardAttr(String bankCardAttr) {
		this.bankCardAttr = bankCardAttr;
	}

	public String getBankDefaultPhone() {
		return bankDefaultPhone;
	}

	public void setBankDefaultPhone(String bankDefaultPhone) {
		this.bankDefaultPhone = bankDefaultPhone;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getPayCardId() {
		return payCardId;
	}

	public void setPayCardId(Integer payCardId) {
		this.payCardId = payCardId;
	}

	public String getPayCardIsverify() {
		return payCardIsverify;
	}

	public void setPayCardIsverify(String payCardIsverify) {
		this.payCardIsverify = payCardIsverify;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	/*
	 * <id>40040</id>
	  <user_id>43518</user_id>
	  <pay_type>sina</pay_type>
	  <bank_code>ICBC</bank_code>
	  <bank_name>工商银行</bank_name>
	  
	  <bank_branch_name>重庆</bank_branch_name>
	  <bank_account_name>杨**</bank_account_name>
	  <bank_card_no>515464**646</bank_card_no>
	  <bank_card_type>DEBIT</bank_card_type>
	  <bank_card_attr>C</bank_card_attr>
	  
	  <bank_default_phone>1521****191</bank_default_phone>
	  <province>河北省</province>
	  <city>唐山市</city>
	  <region_code>2202000000</region_code>
	  <card_no>500225********2819</card_no>
	  
	  
	  <card_type>0</card_type>
	  <status>1</status>
	  <create_userid>43518</create_userid>
	  <create_time>2015/3/17 10:30:41</create_time>
	  <update_time>2015/3/17 10:30:41</update_time>
	  
	  
	  <isvalid>1</isvalid>
	  <remark>绑卡第二步成功</remark>
	  <pay_card_id>7977</pay_card_id>
	  <pay_card_isverify>Y</pay_card_isverify>
	  <request_no>20150317103042</request_no>
	  
	  
	  <ticket>97f5e7610aef4cfaa6e3b0738d911600</ticket>
	 */

}
