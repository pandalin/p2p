package com.jvv.p2p.test.biz;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;

import com.jvv.p2p.test.BaseTest;
import com.jvv.portal.facade.JvvTaskFacade;

public class TaskTest extends BaseTest{
	
	@Inject
	@Qualifier("jvvTaskFacadeWs")
	private JvvTaskFacade jvvTaskFacade;
	
	@Test
	public void a(){
		Boolean.valueOf("a");
		jvvTaskFacade.userCompleteOnceTask("123", 3);
	}
}
