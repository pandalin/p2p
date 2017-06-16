package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

/**
 * Created by cx on 2015/5/25.
 */
public class RequestHead {
	/*
	 * service 接口名称 String(64) 接口名称。 要签 非空 open_account version 接口版本 Number(5)
	 * 接口版本(默认1.0) 要签 可空 1.0 request_time 请求时间 String(17)
	 * 发起请求时间，格式yyyyMMddhhmmssfff 要签 非空 20140801120401233 partner _id 合作者身份ID
	 * String(32) 签约合作方的钱包唯一用户号。 要签 非空 2000001159940003 input_charset 参数编码字符集
	 * String(10) 使用的编码格式，目前只支持utf-8。 要签 可空 utf-8 sign 签名 String(256) 参见“签名机制”。
	 * 不签 非空 e8qdwl9caset5zugii2r7q0k8ikopxor sign_type 签名方式 String(10)
	 * 签名方式支持MD5。 不签 非空 MD5 notify_url 系统异步回调通知地址(暂不支持) String(1000)
	 * 处理发生状态变迁后异步通知结果（具体看接口描述中是否需要此参数） 要签 可空
	 * http://www.test.com/receive_notify.htm return_url 页面跳转同步返回页面路径(暂不支持)
	 * String(1000) 处理完请求后，当前页面自动跳转到接入应用网站里指定页面的http路径（具体看接口描述中是否需要此参数）。 要签 可空
	 * http://www.test.com/receive_return.htm format 返回数据格式 String(10)
	 * 返回数据格式(默认xml),xml/json 要签 可空 xml login_uid 登陆用户ID String(500)
	 * 由api系统产生的一段加密串，里面包含超时时间（默认30分钟） 要签 可空 j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	 * sessionid 客户端会话的唯一ID String(36)
	 * 对web系统可以使用系统的Request.SessionID,对cs系统可以在每次系统运行时定义一个固定变量（推荐GUID） 要签 可空
	 * ro2nkyppg3b0c2bjhk4lyk4l other_pms 其他参数 String(1000)
	 * 说明信息，原文返回。客户可根据需要存放需要在响应时带回的信息。 要签 可空
	 */

	@Title("service")
	private String service;// 接口名称

	@Title("login_uid")
	private String loginUid;// 登录用户id

	@Title("sessionid")
	private String sessionid;//

	@Title("request_time")
	private String requestTime;

	@Title("partner_id")
	private String partnerId;// 合作商id

	@Title("version")
	private Integer version;

	@Title("input_charset")
	private String inputCharset;

	@Title("sign")
	private String sign;

	@Title("sign_type")
	private String signType;

	@Title("format")
	private String format;

	@Title("other_pms")
	private String otherPms;

	public RequestHead() {

	}

	public RequestHead(String serivce) {
		this.service = serivce;
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

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getOtherPms() {
		return otherPms;
	}

	public void setOtherPms(String otherPms) {
		this.otherPms = otherPms;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

}
