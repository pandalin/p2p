package com.jvv.p2p.biz.sys;

/**
 * 字典表 服务
 * 
 * @author cx
 *
 */
public interface LvService {

	/**
	 * 通过type 和key 获取 值。
	 * 
	 * @return
	 */
	String getByTypeKey(String type, String key);

}
