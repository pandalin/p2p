package com.jvv.p2p.facade.request;

import java.io.Serializable;

import com.jvv.p2p.facade.vo.Title;

/**
 * Created by cx on 2015/5/27.
 */
public class BindBankStep1Request implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2943951543585780852L;

	/*
    login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
    sessionid	客户端会话的唯一ID	String(36)	对web系统可以使用系统的Request.SessionID,对cs系统可以在每次系统运行时定义一个固定变量（推荐GUID）	要签	非空	ro2nkyppg3b0c2bjhk4lyk4l
    bank_code	银行编码	String (30)	银行编码(参见附件)	要签	非空	CQRM
    bank_name	银行名	String (50)	银行名(参见附件)	要签	非空
    bank_card_no	银行卡号	String(50)	银行卡号	要签	非空
    bank_card_no_ok	确认银行卡号	String(50)	银行卡号	要签	非空
    bank_phone	银行预留手机号	String(11)	银行预留手机号	要签	非空
    region1_name	区域1名	String(100)	对应第一级区域名	要签	非空
    region2_name	区域2名	String(100)	对应第二级区域名	要签	非空
    region_code	区域编码	String(20)	对应区域编码（选择的最后一级的编码）	要签	非空
    branch_name	支行名称	String(100)	支行名称	要签	可空
     */
    @Title("login_uid")
    private String loginUid;

    @Title("sessionid")
    private String sessionid;

    @Title("bank_code")
    private String bankCode;

    @Title("bank_name")
    private String bankName;

    @Title("bank_card_no")
    private String bankCardNo;

    @Title("bank_card_no_ok")
    private String bankCardNoOk;

    @Title("bank_phone")
    private String bankPhone;

    @Title("region_pname")
    private String region1Name;

    @Title("region_cname")
    private String region2Name;

    @Title("region_code")
    private String regionCode;

    @Title("branch_name")
    private String branchName;

    public String getLoginUid() {
        return loginUid;
    }

    public void setLoginUid(String loginUid) {
        this.loginUid = loginUid;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
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

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankCardNoOk() {
        return bankCardNoOk;
    }

    public void setBankCardNoOk(String bankCardNoOk) {
        this.bankCardNoOk = bankCardNoOk;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getRegion1Name() {
        return region1Name;
    }

    public void setRegion1Name(String region1Name) {
        this.region1Name = region1Name;
    }

    public String getRegion2Name() {
        return region2Name;
    }

    public void setRegion2Name(String region2Name) {
        this.region2Name = region2Name;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
