package com.jvv.p2p.facade.em;

public enum ExperienceTradeStatus {
	caninvest(1),
	setup(2),
	repay(3);
	private final int value;
	private ExperienceTradeStatus(int value)
	{
		this.value = value;
	}
	public int getValue()
	{
		return this.value;
	}
}
