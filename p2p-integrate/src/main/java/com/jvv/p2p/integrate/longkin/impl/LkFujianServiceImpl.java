package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.inject.Inject;
import javax.inject.Named;

import com.jvv.p2p.facade.request.FujianRequest;
import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.sys.Fujian;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.LkFujianService;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;
import com.jvv.p2p.util.FileType;
import com.jvv.p2p.util.FileTypeJudge;

@Named
public class LkFujianServiceImpl implements LkFujianService {

	@Inject
	private LkClient lkClient;

	@Inject
	private ResultConvert resultConvert;

	@Override
	public Fujian download(FujianRequest request) throws Exception {
		final String command = "longkin.others.m_others_fj_download";
		RequestHead head = new RequestHead(command);

		byte[] content = lkClient.origSend(head, request, null);
		FileType ft = FileTypeJudge.getType(content);

		if (ft == null) {
			throw new IOException("文件不存在");
		}
		//TODO 如果是pdf
		Fujian fj = new Fujian();

		switch (ft) {
			default:
			// 设置成错误信息
				Result r = Result.of().withFail().withResponseMsg("未知错误！");
				fj.setResult(r);
				break;
			case XML:
				// 解析成result对象
				LkResponse lkresponse = lkClient.parse(new String(content, Charset.forName("UTF-8")));
				fj.setResult(resultConvert.convert(lkresponse.getHead()));
				break;

			case PDF:
			//　写默认正确信息
				Result result = Result.of().withSuccess();
				fj.setResult(result);
				fj.setFilecontent(content);
				break;
		}

		return fj;

	}
}
