package com.jvv.p2p.facade.response.sys;

import org.xmappr.Element;

public class Regioninfot {

	@Element
	private String code;
	@Element
	private String pcode;
	@Element
	private Integer hieraechy;
	@Element
	private String name;
	@Element
	private String level1name;
	@Element
	private String level2name;
	@Element
	private String level3name;
	@Element
	private String level4name;
	@Element
	private String level5name;

	@Element
	private String fullname;
	@Element
	private String shortname;
	@Element
	private String phoneticizeab;
	@Element
	private String phoneticize;
	@Element
	private Integer sortno;
	@Element
	private Integer status;

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

	public Integer getHieraechy() {
		return hieraechy;
	}

	public void setHieraechy(Integer hieraechy) {
		this.hieraechy = hieraechy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel1name() {
		return level1name;
	}

	public void setLevel1name(String level1name) {
		this.level1name = level1name;
	}

	public String getLevel2name() {
		return level2name;
	}

	public void setLevel2name(String level2name) {
		this.level2name = level2name;
	}

	public String getLevel3name() {
		return level3name;
	}

	public void setLevel3name(String level3name) {
		this.level3name = level3name;
	}

	public String getLevel4name() {
		return level4name;
	}

	public void setLevel4name(String level4name) {
		this.level4name = level4name;
	}

	public String getLevel5name() {
		return level5name;
	}

	public void setLevel5name(String level5name) {
		this.level5name = level5name;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getPhoneticizeab() {
		return phoneticizeab;
	}

	public void setPhoneticizeab(String phoneticizeab) {
		this.phoneticizeab = phoneticizeab;
	}

	public String getPhoneticize() {
		return phoneticize;
	}

	public void setPhoneticize(String phoneticize) {
		this.phoneticize = phoneticize;
	}

	public Integer getSortno() {
		return sortno;
	}

	public void setSortno(Integer sortno) {
		this.sortno = sortno;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
