package com.jvv.p2p.facade.response;


/**
 * Created by cx on 2015/5/27.
 */
public class Result {

	private String responseCode;
	private String responseMsg;
	private String loginUid;
	
	
	transient private final String SUC = "SUCCESS";
	
	transient private final String FAIL = "fail";

	public static Result of() {
		return new Result();
	}

	public Result withSuccess() {
		this.setResponseCode(SUC);
		return this;
	}

	public Result withFail() {
		this.setResponseCode(FAIL);
		return this;
	}

	public Result withResponseMsg(String msg) {
		this.setResponseMsg(msg);
		return this;
	}

	public boolean isSuc() {
		return SUC.equals(this.getResponseCode());
	}

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
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


}
