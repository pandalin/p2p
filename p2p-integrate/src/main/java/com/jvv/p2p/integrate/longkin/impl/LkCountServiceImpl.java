package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.text.ParseException;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.xmappr.Xmappr;

import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.response.account.Keyvalue;
import com.jvv.p2p.facade.response.sys.Count;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.LkCountService;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;
import com.jvv.p2p.util.MoneyUtil;

@Named
public class LkCountServiceImpl implements LkCountService {

	@Inject
	private LkClient lkClient;

	@Inject
	private ResultConvert resultConvert;

	@Override
	public Count count() throws IOException {
		final String smsCommand = "longkin.others.m_others_index_count";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, null);
		Count body = new Count();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(Count.class);
			body = (Count) xm.fromXML(new StringReader(bodyxml));
			// fix 
			String sep = "万";
			if (CollectionUtils.isNotEmpty(body.getKeyvalue())) {

				for (Keyvalue kv : body.getKeyvalue()) {

					if (StringUtils.contains(kv.getValue(), sep)) {
						String a = kv.getValue();

						a = StringUtils.remove(a, "亿");
						a = StringUtils.remove(a, "万");
						BigDecimal money = null;
						try {
							money = MoneyUtil.parseFormat(a);
							money=money.multiply(BigDecimal.valueOf(10000));
							a = money.toString();
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						kv.setValue(a);

					}
				}
			}

		}

		body.setResult(resultConvert.convert(response.getHead()));

		return body;

	}

}
