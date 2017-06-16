package com.jvv.p2p.integrate.longkin;


import java.io.IOException;

import com.jvv.p2p.facade.request.SmsRequest;
import com.jvv.p2p.facade.response.Result;

/**
 * Created by cx on 2015/5/25.
 */
public interface LKSmsService {

    /**
     * 发送 短信
     * @param sms
     *
     * @return
     */
    Result sendSms(SmsRequest sms)  throws IOException;



}
