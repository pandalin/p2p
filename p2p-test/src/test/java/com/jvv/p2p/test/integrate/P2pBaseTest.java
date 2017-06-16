package com.jvv.p2p.test.integrate;

import java.io.IOException;

import javax.inject.Inject;

import com.jvv.p2p.facade.request.LoginRequest;
import com.jvv.p2p.integrate.longkin.LkUserService;
import org.junit.Before;

import com.jvv.p2p.facade.SmsService;
import com.jvv.p2p.facade.UserService;
import com.jvv.p2p.facade.response.user.Userallinfot;
import com.jvv.p2p.facade.vo.User;
import com.jvv.p2p.test.BaseTest;

public abstract class P2pBaseTest extends BaseTest {

	@Inject
	protected SmsService smsService;

	@Inject
	protected UserService userService;

	@Inject
	protected LkUserService lkUserService;

	protected User user;

	protected User user2;

	protected User user3;

	protected User user4;

	protected User user5;

	protected User user6;

	protected User user7;

	protected String loginUid;

	@Before
	public void superinit() throws IOException {

		user = new User();

		user.setPhone("13300020002");
		user.setPassword("123");

		user6 = new User();

		user6.setPhone("13618311009");
		user6.setPassword("h123456");

		user2 = new User();

		user2.setPhone("byang888");
		user2.setPassword("ljb123456");

		user3 = new User();

		user3.setPhone("15902317550");
		user3.setPassword("222222");

		user4 = new User();

		user4.setPhone("15025688808");
		user4.setPassword("8a1148a74ba479fcaca5");

		user5 = new User();

		user5.setPhone("18623557324");
		user5.setPassword("8a1148a74ba479fcaca5");

		user7 = new User();

//		user7.setPhone("15002904615");
		user7.setPhone("15040167342");
		user7.setPassword("123456");
		Userallinfot ui = userService.login(user7.getPhone(),user7.getPassword());
		loginUid = ui.getResult().getLoginUid();

		/*LoginRequest request = new LoginRequest();
		request.setUsername("13996254942");
		request.setPassword("ljb123456");

		Userallinfot ui = lkUserService.loginIn(request);
		loginUid = ui.getResult().getLoginUid();*/
	}
}
