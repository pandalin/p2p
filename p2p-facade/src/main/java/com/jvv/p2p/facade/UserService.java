package com.jvv.p2p.facade;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jvv.p2p.facade.request.EditpasswordRequest;
import com.jvv.p2p.facade.request.QuickOpenRequest;
import com.jvv.p2p.facade.request.RegRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.user.Userallinfot;

/**
 * 
 * 登陆 注册 修改密码 传入的都是md5的密码
 * 
 * Created by cx on 2015/5/20.
 */
@WebService
public interface UserService {

	public static final String PASSWORD_PREFIX = "z9_";

	/**
	 * 登录
	 */
	@WebMethod
	Userallinfot login(String username, String password);

	/**
	 * 登录
	 */
	@WebMethod
	Userallinfot loginMd5(String username, String password);

	@WebMethod
	Userallinfot loginWithRealPass(String username, String password);

	/**
	 * 快速开通 注册 绑定手机 绑定身份证
	 * 
	 * @param request
	 * @throws IOException
	 */
	@WebMethod
	Result quickOpen(QuickOpenRequest request) throws IOException;

	/**
	 * 只是注册
	 * 
	 * @param reg
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result regionReg(RegRequest reg) throws IOException;

	/**
	 * 修改密码
	 *
	 */
	@WebMethod
	Result editpassword(EditpasswordRequest request) throws IOException;

	/**
	 * 登陆心跳
	 * 
	 * @param loginUid
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result loginActive(String loginUid) throws IOException;

}
