package com.jvv.p2p.test.biz;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.jvv.p2p.biz.product.collect.ProductCollect;
import com.jvv.p2p.test.BaseTest;

/**
 * Created by cx on 2015/5/26.
 */
public class ProductCollectlTest extends BaseTest {

	@Inject
	private ProductCollect productCollect;

	@Test
	@Rollback(false)
	public void testCollect() throws Exception {

		try {
			productCollect.collect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}