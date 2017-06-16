package com.jvv.p2p.biz.product.collect;

import java.io.IOException;

/**
 *
 * product collect
 * Created by cx on 2015/5/26.
 */
public interface ProductCollect {

	/**
	 * 收集 线索  (目前对方接口 只支持全量更新接口)
	 *    调用接口
	 *    更新本地数据库
	 */
    void collect() throws IOException;
}
