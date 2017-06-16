package com.jvv.p2p.util;

import java.io.StringReader;

import org.xmappr.Xmappr;

public class XmlUtil {

	public static <T> T parse(String xml, Class<T> claz) {

		Xmappr xm = new Xmappr(claz);
		@SuppressWarnings("unchecked")
		T o = (T) xm.fromXML(new StringReader(xml));

		return o;
	}
}
