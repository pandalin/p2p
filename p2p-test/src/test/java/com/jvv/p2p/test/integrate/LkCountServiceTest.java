package com.jvv.p2p.test.integrate;

import java.io.IOException;

import javax.inject.Inject;

import org.junit.Test;

import com.jvv.p2p.facade.response.sys.Count;
import com.jvv.p2p.integrate.longkin.LkCountService;
import com.jvv.p2p.test.BaseTest;

public class LkCountServiceTest extends BaseTest {

	@Inject
	LkCountService lkCountService;

	@Test
	public void a() throws IOException {
		Count count=lkCountService.count();
	}
}
