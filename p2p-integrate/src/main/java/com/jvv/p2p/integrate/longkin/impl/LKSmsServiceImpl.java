package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.request.SmsRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.integrate.longkin.LKSmsService;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;

/**
 * 短信服务类
 *
 * Created by cx on 2015/5/25.
 */
@Named
public class LKSmsServiceImpl implements LKSmsService {

    @Inject
    private LkClient lkClient;

    @Inject
    private ResultConvert resultConvert;
    
    protected Log log = LogFactory.getLog(this.getClass());

    public Result sendSms(SmsRequest sms) throws IOException {
        
    	final String smsCommand="longkin.user.m_sms_send";
    	RequestHead head=new RequestHead(smsCommand);

        LkResponse response = (LkResponse) lkClient.send(head, sms);

        if(response==null||response.getHead()==null){
            throw new IOException("窝财宝服务器 无返回.");
        }

        return resultConvert.convert(response.getHead());
    }
}
