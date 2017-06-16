package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;
import java.util.HashMap;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import com.jvv.p2p.facade.request.EditpasswordRequest;
import com.jvv.p2p.facade.request.LoginRequest;
import com.jvv.p2p.facade.request.QuickOpenRequest;
import com.jvv.p2p.facade.request.RegRequest;
import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.request.UserInfoRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.user.Userallinfot;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.LkUserService;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;
import com.jvv.p2p.util.XmlUtil;

@Named
public class LkUserServiceImpl implements LkUserService {

	@Inject
	private LkClient lkClient;

	@Inject
	private ResultConvert resultConvert;

	protected Log log = LogFactory.getLog(this.getClass());

	@Override
	public Result regionReg(RegRequest reg) throws IOException {
		final String smsCommand = "longkin.user.m_region_reg";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, reg);
		return resultConvert.convert(response.getHead());
	}

	@Override
	public Userallinfot loginIn(LoginRequest login) throws IOException {
		Assert.notNull(login);

		//请求头信息
		final String smsCommand = "longkin.user.m_login_in";
		RequestHead head = new RequestHead(smsCommand);
		login.setPassword(DigestUtils.md5Hex(login.getPassword()));

		//发送http请求  解析head
		LkResponse response = (LkResponse) lkClient.send(head, login);
		String bodyxml = response.getBody();

		//解析body
		Userallinfot user = new Userallinfot();
		if (response.isSuc()) {
			user = XmlUtil.parse(bodyxml, Userallinfot.class);
		}

		user.setResult(resultConvert.convert(response.getHead()));

		return user;
	}

	@Override
	public Result loginActive(final String loginUid) throws IOException {
		final String command = "longkin.user.m_login_active";
		RequestHead head = new RequestHead(command);

		LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});
		Result result = resultConvert.convert(response.getHead());
		return result;
	}

	@Override
	public Result quickOpen(QuickOpenRequest request) throws IOException {
		final String command = "longkin.user.m_region_reg_zh";
		RequestHead head = new RequestHead(command);

		LkResponse response = lkClient.send(head, request);

		Result result = resultConvert.convert(response.getHead());
		return result;
	}

	@Override
	public Result editpassword(EditpasswordRequest request) throws IOException {
		final String command = "longkin.user.m_modify_pwd";
		RequestHead head = new RequestHead(command);

		LkResponse response = lkClient.send(head, request);
		return resultConvert.convert(response.getHead());
	}

	@Override
	public void getUserInfo(UserInfoRequest request) throws IOException {
		final String command = "longkin.user.m_my_customer_getuserinfo";
		RequestHead head = new RequestHead(command);

		LkResponse response = lkClient.send(head, request);

	}

}
