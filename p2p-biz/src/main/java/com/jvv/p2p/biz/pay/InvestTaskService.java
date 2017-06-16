package com.jvv.p2p.biz.pay;

import com.jvv.p2p.facade.request.InvestRequest;

public interface InvestTaskService {

	void onInvest(InvestRequest invest);
}
