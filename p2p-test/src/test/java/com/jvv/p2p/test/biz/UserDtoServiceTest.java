package com.jvv.p2p.test.biz;

import javax.inject.Inject;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import com.jvv.p2p.biz.user.UserDtoService;
import com.jvv.p2p.entity.ExtUserDto;
import com.jvv.p2p.test.BaseTest;

public class UserDtoServiceTest extends BaseTest{

	@Inject
	private UserDtoService userDtoService;
	
	@Test
	public void a(){
		ExtUserDto user=userDtoService.getByExtUserId("45699");
		log.debug(ToStringBuilder.reflectionToString(user));
	}
}
