package com.jvv.p2p.biz.user;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.jvv.p2p.dao.ExtUserDtoMapper;
import com.jvv.p2p.entity.ExtUserDto;
import com.jvv.p2p.facade.AccountService;
import com.jvv.p2p.facade.UserService;
import com.jvv.p2p.facade.request.BindBankStep1Request;
import com.jvv.p2p.facade.request.BindBankStep2Request;
import com.jvv.p2p.facade.request.BindMobileRequest;
import com.jvv.p2p.facade.request.RealNameRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.account.AccountTotal;
import com.jvv.p2p.facade.response.account.Accountbalanceinfot;
import com.jvv.p2p.facade.response.account.Checkrealnameinfot;
import com.jvv.p2p.facade.response.account.Userbankinfot;
import com.jvv.p2p.facade.response.user.UserAccountInfoT;
import com.jvv.p2p.facade.response.user.Userallinfot;
import com.jvv.p2p.integrate.longkin.LkAccountService;

/**
 *
 *
 * Created by cx on 2015/5/27.
 */
@Named("accountService")
public class AccountServiceImpl implements AccountService {

	@Inject
	private LkAccountService lkAccountService;
	@Inject
	private UserService userService;
	@Inject
	private UserDtoService userDtoService;
	@Inject
	private ExtUserDtoMapper extUserDtoMapper;
	private static final String IS_FINISH_CHEK_REALNAME = "IS_FINISH_CHEK_REALNAME";

	private Log log = LogFactory.getLog(this.getClass());

	@Override
	public Result open(String loginUid) throws IOException {
		Result r = lkAccountService.open(loginUid);

		return r;
	}

	@Override
	public Result bindBankStep1(BindBankStep1Request step1) throws IOException {
		return lkAccountService.bindBankStep1(step1);
	}

	@Override
	public Result bindBankStep2(BindBankStep2Request step2) throws IOException {
		Result result = lkAccountService.bindBankStep2(step2);
		if (result.isSuc()) {
			lkAccountService.upgrade(result.getLoginUid());
		}
		return result;
	}

	@Override
	public UserAccountInfoT getInfo(String loginUid) throws IOException {

		return lkAccountService.getInfo(loginUid);
	}

	@Override
	public AccountTotal getCount(String loginUid) throws IOException {
		return lkAccountService.getCount(loginUid);
	}

	@Override
	public Result realNameCanApply(String loginUid) throws IOException {
		return lkAccountService.realNameCanApply(loginUid);
	}

	@Override
	public Result realnameApply(RealNameRequest request) throws IOException {
		return lkAccountService.realnameApply(request);
	}

	@Override
	public Accountbalanceinfot getBalance(String loginUid) throws IOException {
		return lkAccountService.getBalance(loginUid);
	}

	@Override
	public Result bindMobile(BindMobileRequest request) throws IOException {
		return lkAccountService.bindMobile(request);
	}

	@Override
	public Result canbindBank(String loginUid) throws IOException {
		return lkAccountService.canBindBank(loginUid);

	}

	@Override
	public Userbankinfot getBindBankInfo(String loginUid) throws IOException {
		return lkAccountService.getBindBankInfo(loginUid);
	}

	@Override
	public Result isOpen(String phone) throws IOException {
		return lkAccountService.isOpen(phone);
	}

	@Override
	public Checkrealnameinfot getRealName(String loginUid) throws IOException {
		return lkAccountService.getRealName(loginUid);
	}

	@Override
	public Result unbindbank(String loginUid) throws IOException {
		return lkAccountService.unbindbank(loginUid);
	}

	@Override
	public Result checkUserIsOpenAndRealName(String phone) throws IOException {

		try {
			ExtUserDto userDto = userDtoService.getByExtPhone(phone);
			if (userDto == null) {
				Result r = Result.of().withFail();
				r.setResponseMsg("用户未开通");
				return r;
			}
			//手机号是否开通
			//获取金窝窝用户密码
			String jwwPass = extUserDtoMapper.selectJwwPassword(userDto.getUserId());
			Result r = isOpen(phone);
			if (!r.isSuc()) //已开通  ，检查是否实名

			{
				
				Userallinfot loginUser = userService.loginMd5(phone, jwwPass);
				r = loginUser.getResult();
				if (r.isSuc()) //登陆成功
				{
					String loginUid = r.getLoginUid();
					r = this.realNameCanApply(r.getLoginUid());

					if (IS_FINISH_CHEK_REALNAME.equals(r.getResponseCode())) {
						r.withSuccess();
						r.setLoginUid(loginUid);
						r.setResponseMsg("");
					} else {
						r.withFail();
						r.setResponseMsg("没有实名认证！");
					}
				}else
				{
					log.error("登陆失败!{" + jwwPass + "}");
				}
			} else {
				r = r.withFail();
				r.setResponseMsg("用户未开通");
			}
			return r;
		} catch (Exception e) {
			log.error("检查开通错误", e);
			throw new IOException("系统错误");
		}
	}
}
