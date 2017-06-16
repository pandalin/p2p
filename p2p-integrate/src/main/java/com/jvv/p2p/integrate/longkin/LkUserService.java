package com.jvv.p2p.integrate.longkin;

import java.io.IOException;

import com.jvv.p2p.facade.request.EditpasswordRequest;
import com.jvv.p2p.facade.request.LoginRequest;
import com.jvv.p2p.facade.request.QuickOpenRequest;
import com.jvv.p2p.facade.request.RegRequest;
import com.jvv.p2p.facade.request.UserInfoRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.user.Userallinfot;

/**
 * Created by cx on 2015/5/25.
 */
public interface LkUserService {

	/**
	 * 注册
	 *
	 * @param reg
	 *            注册对象
	 * @return 返回注册结果
	 */
	Result regionReg(RegRequest reg) throws IOException;

	/**
	 * 获取用户信息
	 * 
	 * @throws IOException
	 */
	void getUserInfo(UserInfoRequest userinfo) throws IOException;

	/**
	 * 登录
	 * 
	 * @param login
	 *            登录请求
	 *
	 * @return 返回登录用户
	 */
	Userallinfot loginIn(LoginRequest login) throws IOException;

	/**
	 * 快速开通
	 * 
	 * @param request
	 * @throws IOException
	 */
	Result quickOpen(QuickOpenRequest request) throws IOException;

	/**
	 * 修改密码
	 * 
	 * 
	 * @return
	 */
	Result editpassword(EditpasswordRequest request) throws IOException;

	/**
	 * 登陆心跳
	 * 
	 * @param loginUid
	 * @return
	 * @throws IOException
	 */
	Result loginActive(String loginUid) throws IOException;

}
