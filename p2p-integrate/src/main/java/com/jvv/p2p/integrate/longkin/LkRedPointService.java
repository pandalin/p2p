package com.jvv.p2p.integrate.longkin;

import java.io.IOException;

import com.jvv.p2p.facade.request.RedpointQryRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.account.RedPoint;

/**
 * 隆金宝红包管理服务层
 * */
public interface LkRedPointService {
	RedPoint list(RedpointQryRequest request) throws IOException;
	
	/**
	 * 领取体验金红包
	 * @throws IOException
	 */
	Result receiveExperience(String loginUid , String redpointId) throws IOException;
}
