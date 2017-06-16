package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

import javax.inject.Inject;
import javax.inject.Named;

import org.xmappr.Xmappr;

import com.jvv.p2p.facade.request.BindBankStep1Request;
import com.jvv.p2p.facade.request.BindBankStep2Request;
import com.jvv.p2p.facade.request.BindMobileRequest;
import com.jvv.p2p.facade.request.RealNameCanApplyRequest;
import com.jvv.p2p.facade.request.RealNameRequest;
import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.account.AccountTotal;
import com.jvv.p2p.facade.response.account.Accountbalanceinfot;
import com.jvv.p2p.facade.response.account.Checkrealnameinfot;
import com.jvv.p2p.facade.response.account.Userbankinfot;
import com.jvv.p2p.facade.response.user.UserAccountInfoT;
import com.jvv.p2p.integrate.longkin.LkAccountService;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;

@Named
public class LkAccountServiceImpl implements LkAccountService {

	@Inject
	private LkClient lkClient;

	@Inject
	private ResultConvert resultConvert;

	@Override
	public Result realNameCanApply(final String loginUid) throws IOException {
		final String smsCommand = "longkin.user.m_sinapay_realname_iscanapply";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});
		Result result = resultConvert.convert(response.getHead());

		return result;
	}

	@Override
	public Result open(final String loginUid) throws IOException {

		final String smsCommand = "longkin.user.m_sinapay_account_create";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});
		Result result = resultConvert.convert(response.getHead());

		return result;

	}

	@Override
	public Result realnameApply(RealNameRequest request) throws IOException {

		final String smsCommand = "longkin.user.m_sinapay_realname_apply";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, request);

		return resultConvert.convert(response.getHead());
	}

	@Override
	public UserAccountInfoT getInfo(final String loginUid) throws IOException {
		final String smsCommand = "longkin.user.m_sinapay_account_info_get";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});

		UserAccountInfoT account = new UserAccountInfoT();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(UserAccountInfoT.class);
			account = (UserAccountInfoT) xm.fromXML(new StringReader(bodyxml));
		}
		account.setResult(resultConvert.convert(response.getHead()));

		return account;
	}

	@Override
	public Result bindBankStep1(BindBankStep1Request step1) throws IOException {
		final String smsCommand = "longkin.user.m_sinapay_bindbank_bindstep1";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, step1);

		return resultConvert.convert(response.getHead());
	}

	@Override
	public Result bindBankStep2(BindBankStep2Request step2) throws IOException {
		final String smsCommand = "longkin.user.m_sinapay_bindbank_bindstep2";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, step2);

		return resultConvert.convert(response.getHead());

	}

	@Override
	public AccountTotal getCount(final String loginUid) throws IOException {

		final String smsCommand = "longkin.user.m_sinapay_account_amount_get";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});
		AccountTotal body = new AccountTotal();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(AccountTotal.class);
			body = (AccountTotal) xm.fromXML(new StringReader(bodyxml));
		}
		body.setResult(resultConvert.convert(response.getHead()));

		return body;

	}

	@Override
	public Accountbalanceinfot getBalance(final String loginUid) throws IOException {
		final String smsCommand = "longkin.user.m_sinapay_balance_get";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});

		Accountbalanceinfot body = new Accountbalanceinfot();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(Accountbalanceinfot.class);
			body = (Accountbalanceinfot) xm.fromXML(new StringReader(bodyxml));
		}
		body.setResult(resultConvert.convert(response.getHead()));

		return body;

	}

	@Override
	public Result bindMobile(BindMobileRequest request) throws IOException {
		final String smsCommand = "longkin.user.m_sinapay_phone_bind";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, request);

		return resultConvert.convert(response.getHead());

	}

	@Override
	public Result canBindBank(final String loginUid) throws IOException {
		final String smsCommand = "longkin.user.m_sinapay_bindbank_iscanbind";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});

		return resultConvert.convert(response.getHead());
	}

	@Override
	public Userbankinfot getBindBankInfo(final String loginUid) throws IOException {
		final String command = "longkin.user.m_sinapay_bindbank_get";
		RequestHead head = new RequestHead(command);

		LkResponse response = (LkResponse) lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});

		Userbankinfot body = new Userbankinfot();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(Userbankinfot.class);
			body = (Userbankinfot) xm.fromXML(new StringReader(bodyxml));
		}
		body.setResult(resultConvert.convert(response.getHead()));

		return body;

	}

	@Override
	public Result isOpen(final String phone) throws IOException {
		final String smsCommand = "longkin.user.m_validate_phone_exists";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("phone", phone);
			}
		});
		Result result = resultConvert.convert(response.getHead());

		return result;
	}

	@Override
	public Result upgrade(final String loginUid) throws IOException {

		final String smsCommand = "longkin.user.m_sinapay_upgrade_savingpot";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});
		Result result = resultConvert.convert(response.getHead());

		return result;
	}

	@Override
	public Checkrealnameinfot getRealName(final String loginUid) throws IOException {
		final String smsCommand = "longkin.user.m_sinapay_realname_get";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});

		Checkrealnameinfot body = new Checkrealnameinfot();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(Checkrealnameinfot.class);
			body = (Checkrealnameinfot) xm.fromXML(new StringReader(bodyxml));
		}
		body.setResult(resultConvert.convert(response.getHead()));
		return body;
	}

	@Override
	public Result unbindbank(final String loginUid) throws IOException {
		final String smsCommand = "longkin.user.m_sinapay_jcbindbank";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("login_uid", loginUid);
			}
		});
		Result result = resultConvert.convert(response.getHead());

		return result;
	}

}
