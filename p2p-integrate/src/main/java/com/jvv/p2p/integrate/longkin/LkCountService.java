package com.jvv.p2p.integrate.longkin;

import java.io.IOException;

import com.jvv.p2p.facade.response.sys.Count;

public interface LkCountService {

	/**
	 * 查询 平台的统计数据
	 * 
	 * @return
	 * @throws IOException
	 */
	Count count() throws IOException;
}
