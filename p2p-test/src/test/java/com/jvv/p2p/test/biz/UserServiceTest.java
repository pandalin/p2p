package com.jvv.p2p.test.biz;

import static com.google.common.base.Preconditions.checkArgument;

import java.io.IOException;

import javax.inject.Inject;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.annotation.Rollback;

import com.jvv.p2p.facade.UserService;
import com.jvv.p2p.facade.request.QuickOpenRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.user.Userallinfot;
import com.jvv.p2p.facade.vo.User;
import com.jvv.p2p.test.BaseTest;

public class UserServiceTest extends BaseTest {

	@Inject
	UserService userService;
	@Inject
	RedisTemplate<String, String> redisTemplate;

	User u = null;

	User u2 = null;

	User u3 = null;

	User u4 = null;

	@Before
	public void init() {
		u = new User();
		u.setPhone("18600010109");
		u.setPassword("265789");

		u2 = new User();
		u2.setPhone("13300010003");
		u2.setPassword("a66");

		u3 = new User();
		u3.setPhone("byang888");
		u3.setPassword("ljb123456");

		u4 = new User();
		u4.setPhone("18375693021");
		u4.setPassword("lin123");
	}
	@Test
	@Rollback(false)
	public void d() throws Exception {

		//TODO 开通一个账户
		QuickOpenRequest reg = new QuickOpenRequest();
		reg.setPhone(u4.getPhone());
		reg.setPassword(DigestUtils.md5Hex(u4.getPassword()));

		reg.setCertNo("513902198705131977");
		reg.setRealname("林小敏");

		reg.setSmscode("64882");
		reg.setUserId("-1");

		Result r = userService.quickOpen(reg);

		checkArgument(r.isSuc(), "开通失败");

		//TODO 登陆

		//TODO 修改密码

		//TODO　登陆

	}


	@Test
	public void e() throws IOException {
		Userallinfot ui = userService.login(u4.getPhone(), u4.getPassword());
		checkArgument(ui.getResult().isSuc(), "登陆失败");

		//		String np = "123";
		//		EditpasswordRequest p = new EditpasswordRequest();
		//		p.setLoginUid(ui.getResult().getLoginUid());
		//		p.setPwd(DigestUtils.md5Hex(np));
		//		p.setPwdOk(p.getPwd());
		//		
		//		Result r = userService.editpassword(p);
		//
		//		checkArgument(r.isSuc(), "修改失败");
		//
		//		Userallinfot ui2 = userService.login(u.getPhone(), np);
		//		checkArgument(ui2.getResult().isSuc(), "登陆失败");

	}

	public void edti() {

	}

	public void a() throws Exception {
		String prfix = "abcd";

		String userId = "123";
		String token = "a123";
		String token2 = "badf";

		String userId2 = "3";
		String token3 = "a0d";
		redisTemplate.opsForValue().set(prfix + userId, token);

		redisTemplate.opsForValue().set(prfix + userId, token2);

		redisTemplate.opsForValue().set(prfix + userId2, token3);

		Thread.sleep(1000 * 10);

		String dtoken = redisTemplate.opsForValue().get(prfix + userId);

		String dtoken2 = redisTemplate.opsForValue().get(prfix + userId2);

		log.debug(dtoken);
		log.debug(dtoken2);

	}

	public void b() throws Exception {
		String username = "13708387978";
		String password = "123456";

		QuickOpenRequest request = new QuickOpenRequest();
		request.setCertNo("510322197811115546");
		request.setRealname("但承艳");

		request.setPhone(username);
		request.setPassword(password);

		request.setSmscode("32682");

		Result r = userService.quickOpen(request);
		if (r.isSuc()) {
			// 登陆
			Userallinfot ui = userService.login(username, password);

			assert ui.getResult().isSuc();
		}

		log.debug(r.isSuc());
	}
}
