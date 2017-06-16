package com.jvv.p2p.integrate.longkin.response;

import javax.xml.bind.annotation.XmlElement;

import org.xmappr.Element;

/**
 * Created by cx on 2015/5/25.
 */
public class ResponseHead {
	/*
	response_time	请求时间	String(17)	发起请求时间，格式yyyyMMddhhmmssfff	要签	非空	20140801120401233
	service	接口名称	String(64)	接口名称。	要签	非空	open_test
	partner_id	合作者身份ID 	String(36) 	签约合作方的唯一用户号。	要签	可空	63b85816-d209-4692-a372-acb3206edbff
	input_charset	参数编码字符集	String(10)	使用的编码格式支持utf-8。	要签	非空	utf-8
	sign 	签名	String(256)	参见“签名机制”。	不签	非空	e8qdwl9caset5zugii2r7q0k8ikopxor
	sign_type 	签名方式	String(10)	签名方式支持md5。	不签	非空	md5
	response_code	响应码	String(30)	参见附录	要签	非空	SUCCESS
	response_msg	响应信息	String(400)	参见附录	要签	可空	合作方Id不存在
	login_uid	登陆用户ID	String(500)	用户传递了login_uid后，并且有效，api系统返回更新后的新login_uid	要签	可空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	sessionid	客户端会话的唯一ID	String(36)	请求时传入的值	要签	可空	ro2nkyppg3b0c2bjhk4lyk4l
	other_pms	其他参数	String(1000)	说明信息，与请求中other_pms内容一致	要签	可空
	*/
	transient private String SUC = "SUCCESS";

	@Element(name = "response_time")
	private String responseTime;

	@Element(name = "service")
	private String service;

	@Element(name = "partner_id")
	private String partnerId;

	@Element(name = "input_charset")
	private String inputCharset;

	@Element(name = "sign")
	private String sign;

	@Element(name = "sign_type")
	private String signType;

	@Element(name = "response_code")
	private String responseCode;

	@Element(name = "response_msg")
	private String responseMsg;

	@Element(name = "login_uid")
	private String loginUid;

	@Element(name = "sessionid")
	private String sessionid;

	@Element(name = "other_pms")
	private String otherPms;

	public boolean isSuc() {
		return this.SUC.equals(this.getResponseCode());
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getInputCharset() {
		return inputCharset;
	}

	public void setInputCharset(String inputCharset) {
		this.inputCharset = inputCharset;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

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

	public String getOtherPms() {
		return otherPms;
	}

	public void setOtherPms(String otherPms) {
		this.otherPms = otherPms;
	}
}
