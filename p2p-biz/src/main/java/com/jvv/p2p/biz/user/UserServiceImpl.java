package com.jvv.p2p.biz.user;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;

import com.google.common.eventbus.EventBus;
import com.jvv.p2p.biz.BusinessException;
import com.jvv.p2p.biz.EventType;
import com.jvv.p2p.facade.LoginUidService;
import com.jvv.p2p.facade.UserService;
import com.jvv.p2p.facade.request.EditpasswordRequest;
import com.jvv.p2p.facade.request.LoginRequest;
import com.jvv.p2p.facade.request.QuickOpenRequest;
import com.jvv.p2p.facade.request.RegRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.user.Userallinfot;
import com.jvv.p2p.facade.vo.User;
import com.jvv.p2p.integrate.longkin.LkUserService;

/**
 * Created by cx on 2015/5/25.
 */
@Named("userService")
public class UserServiceImpl implements UserService {

	@Inject
	private LkUserService lkUserService;
	@Inject
	private LoginUidService loginUidService;
	@Inject
	private UserDtoService userDtoService;

	@Override
	public Userallinfot login(String username, String password) {
		return loginMd5(username, DigestUtils.md5Hex(password));
	}

	@Override
	public Userallinfot loginWithRealPass(String username, String password) {
		Userallinfot r = null;
		try {
			checkNotNull(password, "[password] 不能为空");

			LoginRequest request = new LoginRequest();
			request.setUsername(username);
			request.setPassword(password);

//			request.setUsername("13996254942");
//			request.setPassword("ljb123456");
			
			r = lkUserService.loginIn(request);

			// 触发登陆成功事件
			if (r.getResult().isSuc()) {
				//记录loginUid和 userId的关系
				loginUidService.create(r.getUserbase().getUserbaseinfot().getId() + "", r.getResult().getLoginUid());

				EventBus event = new EventBus(EventType.login.name());
				event.register(userDtoService);
				event.post(r);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException(e);
		}
		return r;
	}

	@Override
	public Userallinfot loginMd5(String username, String password) {

		String newpassword = null;

		newpassword = getNewPassword(password);

		return loginWithRealPass(username, newpassword);
	}

	@Override
	public Result quickOpen(QuickOpenRequest request) throws IOException {
		Result result = null;
		try {
			checkNotNull(request, "参数不能为空");
			checkNotNull(request.getPassword(), "[password] 不能为空");
			checkNotNull(request.getUserId(), "[userId] 不能为空");
			//切换密码
			String oldpassword = request.getPassword();
			request.setPassword(getNewPassword(oldpassword));

			//　fix reg
			result = lkUserService.quickOpen(request);

			// 触发注册 成功事件
			User user = new User();
			user.setPhone(request.getPhone());
			user.setPassword(request.getPassword());
			user.setIdcard(request.getCertNo());
			user.setRealname(request.getRealname());
			user.setUserId(request.getUserId());//jvv数据库 userId

			String realnameErr = "实名认证[参数校验未通过]";
			String realnameErr2 = "实名认证[实名认证不通过]";
			

			// 触发登陆 记录userId
			if (result.isSuc() || (result.getResponseMsg().equals(realnameErr)||result.getResponseMsg().equals(realnameErr2))) {
				Userallinfot ui = this.loginMd5(request.getPhone(), oldpassword);
				if (ui.getResult().isSuc()) {
					user.setExtUserId(ui.getUserbase().getUserbaseinfot().getId() + "");
				}

				EventBus event = new EventBus(EventType.regist.name());

				event.register(userDtoService);
				event.post(user);
			}

		} catch (Exception e) {
			throw new BusinessException(e);
		}
		return result;
	}

	@Deprecated
	public Result register(User user, String code) {
		RegRequest reg = new RegRequest();
		Result r = null;

		try {
			//convert
			reg = convert(user);
			reg.setCode(code);
			r = lkUserService.regionReg(reg);

		} catch (IOException e) {
			Result.of().withFail().withResponseMsg(e.getMessage());
		}

		return r;
	}

	private RegRequest convert(User orig) {
		RegRequest dest = new RegRequest();
		BeanUtils.copyProperties(orig, dest);

		return dest;
	}

	@Override
	public Result loginActive(String loginUid) throws IOException {
		return lkUserService.loginActive(loginUid);
	}

	@Override
	public Result editpassword(EditpasswordRequest request) throws IOException {

		checkNotNull(request, "参数不能为空");
		checkNotNull(request.getPwd(), "pwd不能为空");
		checkArgument(request.getPwd().equals(request.getPwdOk()), "两次输入的密码不一致");

		String nps = getNewPassword(request.getPwd());
		request.setPwd(nps);
		request.setPwdOk(request.getPwd());

		request.setType("jww");

		return lkUserService.editpassword(request);
	}

	private String getNewPassword(String md5password) {
		checkArgument(StringUtils.isNotEmpty(md5password));

		int pwlength = 20;
		StringBuilder newpass = new StringBuilder();
		md5password = StringUtils.substring(md5password, 0, pwlength);

		newpass.append(PASSWORD_PREFIX).append(md5password);

		return newpass.toString();
	}

	@Override
	public Result regionReg(RegRequest reg) throws IOException {
		checkNotNull(reg, "参数reg不能为空");
		checkNotNull(reg.getPassword(), "参数password不能为空");

		reg.setPassword(getNewPassword(reg.getPassword()));

		Result r = lkUserService.regionReg(reg);
		return r;
	}

}
