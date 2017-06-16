package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class RegionRequest {

	/*
	code	编码	String(50)	编码(精确查询)(该参数有值时，自动忽略pcode参数)	要签	可空	20040503
	pcode	父级编码	String(50)	父级编码（第一级数据父级编码为0）(精确查询)	要签	非空
	*/
	transient private final String TOP_LEVEL = "0";

	@Title("code")
	private String code;

	@Title("pcode")
	private String pcode;

	public RegionRequest() {
		this.setPcode(TOP_LEVEL);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

}
