package com.jvv.p2p.integrate.longkin;

import com.jvv.p2p.facade.request.FujianRequest;
import com.jvv.p2p.facade.response.sys.Fujian;

/**
 * 附件下载 服务类
 * 
 * @author cx
 *
 */
public interface LkFujianService {

	Fujian download(FujianRequest request) throws Exception;
}
