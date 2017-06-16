package com.jvv.p2p.test.integrate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.inject.Inject;

import org.junit.Test;

import com.jvv.p2p.facade.em.FujianType;
import com.jvv.p2p.facade.request.FujianRequest;
import com.jvv.p2p.facade.response.sys.Fujian;
import com.jvv.p2p.integrate.longkin.LkFujianService;

public class LKFujianServiceTest extends P2pBaseTest {

	@Inject
	LkFujianService service;

	@Test
	public void a() {
		System.out.println(user7.getPhone());
		FujianRequest request = new FujianRequest();
		request.setLoginUid(loginUid);
		request.setType(FujianType.tzpz.name());
		request.setSourceid("17927");

		try {
			Fujian fujian = service.download(request);

			if (fujian.getResult().isSuc()) {

				OutputStream o = new FileOutputStream(new File("D:", "1.pdf"));
				o.write(fujian.getFilecontent());
				o.flush();
				o.close();
			}

			log.debug(fujian.getResult().isSuc());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
	
	@Test
	public void b() {
		FujianRequest request = new FujianRequest();
		request.setLoginUid(loginUid);
		request.setType(FujianType.olddbht.name());
		request.setSourceid("7");

		try {
			Fujian fujian = service.download(request);

			if (fujian.getResult().isSuc()) {

				OutputStream o = new FileOutputStream(new File("D:", "2.pdf"));
				o.write(fujian.getFilecontent());
				o.flush();
				o.close();
			}

			log.debug(fujian.getResult().isSuc());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
