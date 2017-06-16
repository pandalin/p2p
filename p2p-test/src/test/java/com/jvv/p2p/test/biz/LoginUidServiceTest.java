package com.jvv.p2p.test.biz;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimaps;
import com.jvv.p2p.facade.LoginUidService;

/**
 * Created by cx on 2015/6/1.
 */
public class LoginUidServiceTest {

	@Inject
	private LoginUidService loginUidService;

	protected Log log = LogFactory.getLog(this.getClass());

	@Test
	public void a() {
		ListMultimap<String, String> uidMap = ArrayListMultimap.create();

		uidMap.put("1", "a");
		uidMap.put("1", "c");

		uidMap.put("2", "b");
		uidMap.put("3", "b");

		uidMap.put("3", "d");

		String key = getKeyByValue(uidMap, "b");

		log.debug(key);

	}

	public String getKeyByValue(ListMultimap<String, String> uidMap, String value) {
		ArrayListMultimap<String, String> invert = Multimaps.invertFrom(uidMap, ArrayListMultimap.<String, String> create());

		List<String> uid = invert.get(value);

		if (uid == null) {
			return null;
		}

		return uid.get(0);
	}
}