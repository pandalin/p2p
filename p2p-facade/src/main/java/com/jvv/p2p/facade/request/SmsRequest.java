package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.em.SmsType;
import com.jvv.p2p.facade.vo.Title;

/**
 * Created by cx on 2015/5/25.
 */
public class SmsRequest {

	/*
	phone	手机号	String(11)	手机号(部分类型验证需要传递登陆人ID，手机号系统取用户信息中的手机号)	要签	可空	13412345678
	type	类型	Int(2)	见附录(短信发送类型)	要签	非空	1
	chanel	通道	Int(2)	0:移动短信[默认],1:CPP语音	要签	非空	0
	login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	可空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	*/

	@Title("phone")
	private String phone;

	@Title("type")
	private Integer type;

	@Title("chanel")
	private Integer chanel;

	@Title("login_uid")
	private String loginUid;

	public static SmsRequest of() {
		return new SmsRequest();
	}

	public SmsRequest() {

	}

	public SmsRequest(SmsType type) {
		if (type != null) {
			this.setType(type.getValue());
		}
	}

	public SmsRequest withType(SmsType type) {
		if (type != null) {
			this.setType(type.getValue());
		}
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getChanel() {
		return chanel;
	}

	public void setChanel(Integer chanel) {
		this.chanel = chanel;
	}

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}

}
