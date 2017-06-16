package com.jvv.p2p.util;

import org.apache.commons.lang.StringUtils;

public class StringUtil {

	public static String getBodyXml(String xml){
		StringBuilder body=new StringBuilder();
		body.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		body.append(StringUtils.substringBetween(xml, "<body>", "</body>"));
		return body.toString();
	}
}
