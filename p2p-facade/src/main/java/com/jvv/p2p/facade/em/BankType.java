package com.jvv.p2p.facade.em;

public enum BankType {

	CZ, //	充值银行
	TX, //	提现银行
	;
	public static BankType getByName(String name) {
		for (BankType v : values()) {
			if (v.name().equals(name)) {
				return v;
			}
		}
		return null;
	}
}
