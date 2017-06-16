package com.jvv.p2p.facade;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 保存 user_id 和 login_uid的关系
 * 
 * @author cx
 *
 */
@WebService
public interface LoginUidService {

	/**
	 * 通过 userId 生成 login_uid
	 * 
	 * @param userId
	 * @return
	 */
	@WebMethod
	void create(String userId, final String token);

	/**
	 * 记录新的 登陆uid
	 * 
	 * @param oldLoginUid
	 * @param newLoginUid
	 */
	@WebMethod
	void record(String oldtoken, String newtoken);

	/**
	 * 通过 login_uid 查找 userId
	 * 
	 * @param loginUid
	 * @return
	 */
	@WebMethod
	String getIdByLoginUid(String loginUid);
	
	
	/**
	 * 通过 login_uid 查找 userId
	 * 
	 * @param loginUid
	 * @return
	 */
	@WebMethod
	String getUserIdByLoginUid(String loginUid);
	
	

}
