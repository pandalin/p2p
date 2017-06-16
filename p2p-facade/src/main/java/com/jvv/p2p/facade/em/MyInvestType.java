package com.jvv.p2p.facade.em;

public enum MyInvestType {

	/*
	-1	所有投资
	1	待成立
	2	已成立
	3	回款中
	4	已回款
	5	未成立
	*/
	all("-1"), wait("2"), setup("3"), backing("4"), backed("5"), fail("1"),

	;
	private final String value;

	private MyInvestType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
