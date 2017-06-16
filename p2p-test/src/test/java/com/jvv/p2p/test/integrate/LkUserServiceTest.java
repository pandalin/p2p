package com.jvv.p2p.test.integrate;

import java.io.IOException;

import javax.inject.Inject;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import com.jvv.p2p.facade.UserService;
import com.jvv.p2p.facade.request.EditpasswordRequest;
import com.jvv.p2p.facade.request.QuickOpenRequest;
import com.jvv.p2p.facade.request.UserInfoRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.integrate.longkin.LkUserService;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

public class LkUserServiceTest extends P2pBaseTest {

	@Inject
	private LkUserService lkUserService;

	@Inject
	private UserService userService;

	@Test
	public void a() throws IOException {

		Result r = lkUserService.loginActive(loginUid);
		log.debug(r.getLoginUid());
 
	}

	@Test
	public void e() throws IOException{
		UserInfoRequest userinfo=new UserInfoRequest();
		userinfo.setLoginUid(loginUid);
		userinfo.setUsername("15902317550");
		lkUserService.getUserInfo(userinfo);
	}

	@Test
	@Transactional
	@Rollback(false)
	public void b() throws IOException {
		QuickOpenRequest request = new QuickOpenRequest();
		/*request.setPhone("18375693021");
		request.setPassword("e10adc3949ba59abbe56e057f20f883e");
		request.setCertNo("513902198705131977");
		request.setRealname("林小敏");
		request.setUserId("-1");

		request.setSmscode("91040");*/

		request.setPhone("13662245985");
		request.setPassword("e10adc3949ba59abbe56e057f20f883e");
		request.setCertNo("430211197907082879");
		request.setRealname("陆正东");
		request.setUserId("0005ece2-6d69-11e5-a01c-ecf4bbd33fc4");

		request.setSmscode("72656");

		/*request.setPhone("15040167342");
		request.setPassword("e10adc3949ba59abbe56e057f20f883e");
		request.setCertNo("350581198310207720");
		request.setRealname("顾思涵");
		request.setUserId("0005c736-c30e-11e5-b300-d89d672713e0");

		request.setSmscode("27207");*/

		userService.quickOpen(request);
	}

	@Test
	public void c() throws IOException {
		EditpasswordRequest request = new EditpasswordRequest();
		request.setLoginUid(loginUid);
		request.setPwd("z9_e10adc3949ba59abbe56");
		request.setPwdOk(request.getPwd());
		request.setType("jww");
		lkUserService.editpassword(request);
	}
}
