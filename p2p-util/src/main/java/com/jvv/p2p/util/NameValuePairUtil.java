package com.jvv.p2p.util;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.NameValuePair;

public class NameValuePairUtil {

	public static String get(List<NameValuePair> parmas, String name) {

		if (CollectionUtils.isEmpty(parmas)) {
			return null;
		}
		if (StringUtils.isEmpty(name)) {
			return null;
		}

		for (NameValuePair nvp : parmas) {
			if (name.equals(nvp.getName())) {
				return nvp.getValue();
			}
		}
		return null;
	}

}
