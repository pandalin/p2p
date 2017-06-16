package com.jvv.p2p.integrate.longkin;

import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.http.NameValuePair;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Assert;
import org.xmappr.Xmappr;

import com.jvv.p2p.facade.LoginUidService;
import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.integrate.longkin.response.LkResponse;
import com.jvv.p2p.util.FileType;
import com.jvv.p2p.util.FileTypeJudge;
import com.jvv.p2p.util.NameValuePairUtil;
import com.jvv.p2p.util.SimpleHttpClient;
import com.jvv.p2p.util.StringUtil;

/**
 * Created by cx on 2015/5/25.
 */
@Named
public class LkClient {

	@Value("#{client['longkin.url']}")
	private String lkUrl;

	@Value("#{client['longkin.md5key']}")
	private String lkMd5key;

	@Value("#{client['longkin.partnerId']}")
	private String partnerId;

	@Inject
	private LoginUidService loginUidService;

	public static final int DEFAULT_PAGE_SIZE = 30;

	private static final String SIGN_TYPE = "MD5";

	private final Logger log = Logger.getLogger(this.getClass());

	private final Logger cmlog = Logger.getLogger("cm.longkin.p2p");

	public LkResponse send(RequestHead head, Object request) throws IOException {
		return send(head, request, null);
	}

	@SuppressWarnings("serial")
	public byte[] origSend(RequestHead head, Object request, Map<String, String> extendParams) throws IOException {
		Assert.notNull(head);
		//组装 head信息
		head.setRequestTime(DateFormatUtils.format(new Date(), "yyyyMMddHHmmssSSS"));
		head.setPartnerId(partnerId);

		SimpleHttpClient client = SimpleHttpClient.of().generateUrl(lkUrl, new Object[] { head, request }, extendParams);

		//TODO 标注为 要签名的 才进入签名计算
		final String sign = generateSign(client.getParams());

		client.addExtParams(new HashMap<String, String>() {
			{
				this.put("sign", sign);
				this.put("sign_type", SIGN_TYPE);
			}
		});
		cmlog.debug("qry string:" + client.getQryString());
		// 发送request
		byte[] response = client.executeByte();
		FileType t = FileTypeJudge.getType(response);

		cmlog.debug(t);

		// 尝试解析
		cmlog.debug(new String(response, Charset.forName("UTF-8")));
		return response;

	}

	@SuppressWarnings("serial")
	public LkResponse send(RequestHead head, Object request, Map<String, String> extendParams) throws IOException {

		Assert.notNull(head);
		//组装 head信息
		head.setRequestTime(DateFormatUtils.format(new Date(), "yyyyMMddHHmmssSSS"));
		head.setPartnerId(partnerId);

		SimpleHttpClient client = SimpleHttpClient.of().generateUrl(lkUrl, new Object[] { head, request }, extendParams);

		//TODO 标注为 要签名的 才进入签名计算
		final String sign = generateSign(client.getParams());

		client.addExtParams(new HashMap<String, String>() {
			{
				this.put("sign", sign);
				this.put("sign_type", SIGN_TYPE);
			}
		});
		cmlog.info("qry string:" + client.getQryString());
		// 发送request

		String xml = client.execute();
		cmlog.info(xml);

		LkResponse response = parse(xml);

		//　如果成功  记录新的 loginUid
		if (response.isSuc()) {
			//如果参数 loginUid不为空
			//如果返回值 loginUid不为空
			List<NameValuePair> parmas = client.getParams();
			String paramLu = NameValuePairUtil.get(parmas, "login_uid");
			if (paramLu != null) {
				String returnLu = response.getHead().getLoginUid();
				if (returnLu != null) {
					loginUidService.record(paramLu, returnLu);
				}
			}

		}

		// TODO 如果失败抛出异常　

		return response;
	}

	public LkResponse parse(String xml) {
		// 解析头部返回值
		Xmappr xm = new Xmappr(LkResponse.class);
		LkResponse response = (LkResponse) xm.fromXML(new StringReader(xml));

		response.setBody(StringUtil.getBodyXml(xml));
		return response;
	}

	private String generateSign(List<NameValuePair> params) {
		// 参数按照 key的首字母排序
		Comparator<NameValuePair> comp = new Comparator<NameValuePair>() {
			@Override
			public int compare(NameValuePair p1, NameValuePair p2) {
				return p1.getName().compareTo(p2.getName());
			}
		};
		Collections.sort(params, comp);

		String paramsStr = getQuery(params);

		// sign=MD5(“待签名串”+”MD5私匙”)

		String sign = DigestUtils.md5Hex(paramsStr + lkMd5key);
		return sign;
	}

	private String getQuery(List<NameValuePair> params) {
		StringBuilder result = new StringBuilder();
		boolean first = true;

		for (NameValuePair pair : params) {
			if (first)
				first = false;
			else
				result.append("&");

			result.append(pair.getName());
			result.append("=");
			result.append(pair.getValue());
		}

		return result.toString();
	}
}
