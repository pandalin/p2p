package com.jvv.p2p.test;

import java.io.StringReader;
import java.math.BigDecimal;
import java.net.URI;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.junit.Test;
import org.xmappr.Xmappr;

import com.jvv.p2p.facade.response.pay.WithdrawTradeno;

public class XmlUtilTest {

	protected Log log = LogFactory.getLog(this.getClass());

	public void a() throws Exception {

		String url = "http://127.0.0.1:7001/jvv/w/promotion/spread/midyearResult?score=5323&phone=15902317550&token=123123";

		List<NameValuePair> params = URLEncodedUtils.parse(new URI(url), "UTF-8");

		for (NameValuePair p : params) {
			log.debug(ToStringBuilder.reflectionToString(p));
		}

		List<NameValuePair> params2 = URLEncodedUtils.parse(new URI(url), "UTF-8");
		String cleanurl = StringUtils.substringBefore(url, "?");
		URIBuilder builder = new URIBuilder().setPath(cleanurl);
		for (NameValuePair p : params) {
			if (!p.getName().equals("token")) {
				builder.addParameter(p.getName(), p.getValue());
			}
		}

		URI uri = builder.build();
		log.debug(uri.toString());
	}

	public void b() {
		String bodyxml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>    <string>nb9907</string>";

		Xmappr xm = new Xmappr(WithdrawTradeno.class);
		WithdrawTradeno body = (WithdrawTradeno) xm.fromXML(new StringReader(bodyxml));

		log.debug(ToStringBuilder.reflectionToString(body));

	}
	@Test
	public void c() {
		String jvvpass = "123457";

		String b = DigestUtils.md5Hex(jvvpass);

		String a = "z9_" + StringUtils.substring(b, 0, 20);
		log.debug(a);

	}

	
	public void d() throws ParseException {
		
		String a = "11亿7,376.16万";
		
		a=StringUtils.remove(a, "亿");
		a=StringUtils.remove(a, "万");
		
		BigDecimal b=e(a);
		b=b.multiply(BigDecimal.valueOf(10000));
		a = b.toString();
		
		log.debug(a);
	}

	public BigDecimal e(String a) throws ParseException {
		// Create a DecimalFormat that fits your requirements
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setGroupingSeparator(',');
		symbols.setDecimalSeparator('.');
		String pattern = "#,##0.0#";
		DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
		decimalFormat.setParseBigDecimal(true);

		// parse the string
		//"10,692,467,440,017.120"
		BigDecimal bigDecimal = (BigDecimal) decimalFormat.parse(a);
		System.out.println(bigDecimal);
		return bigDecimal;
	}

}
