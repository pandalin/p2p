package com.jvv.p2p.test.integrate;

import com.jvv.p2p.facade.request.SinaPayWithDrawRequest;
import com.jvv.p2p.facade.request.SyncStateRequest;
import com.jvv.p2p.facade.response.sinapay.APIResponseT;
import com.jvv.p2p.integrate.longkin.LkSinaPayService;
import com.jvv.p2p.test.integrate.P2pBaseTest;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import javax.annotation.Resource;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by linxm on 2016/8/8.
 */
public class LkSinaPayServiceTest extends P2pBaseTest {

    @Resource
    private LkSinaPayService lkSinaPayService;

    @Test
    public void sinaPayPwdSet() throws Exception {
        APIResponseT apiResponseT = lkSinaPayService.sinaPayPwdSet(loginUid);
        logger.debug(ToStringBuilder.reflectionToString(apiResponseT));
    }

    @Test
    public void sinaPayPwdModify() throws Exception {
        APIResponseT apiResponseT = lkSinaPayService.sinaPayPwdModify(loginUid);
        logger.debug(ToStringBuilder.reflectionToString(apiResponseT));
    }

    @Test
    public void sinaPayPwdFind() throws Exception {
        APIResponseT apiResponseT = lkSinaPayService.sinaPayPwdFind(loginUid);
        logger.debug(ToStringBuilder.reflectionToString(apiResponseT));
    }

    @Test
    public void syncSinaState() throws Exception {

        SyncStateRequest request = new SyncStateRequest();
        request.setLoginUid(loginUid);
        request.setOptype(1);
//        request.setOrder("");
        APIResponseT apiResponseT = lkSinaPayService.syncSinaState(request);
        logger.debug(ToStringBuilder.reflectionToString(apiResponseT));
    }

    @Test
    public void sinaPayWithdraw() throws Exception {

        SinaPayWithDrawRequest request = new SinaPayWithDrawRequest();
        request.setLoginUid(loginUid);
        request.setSessionId(UUID.randomUUID().toString());
        request.setAmount(new BigDecimal(99));
        APIResponseT apiResponseT = lkSinaPayService.sinaPayWithdraw(request);
        logger.debug(ToStringBuilder.reflectionToString(apiResponseT));
    }

    @Test
    public void deposit() {

        try {
            logger.info(ToStringBuilder.reflectionToString(lkSinaPayService.deposit(loginUid,new BigDecimal(4000))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void userInfoShow() {

        try {
            logger.info(ToStringBuilder.reflectionToString(lkSinaPayService.userInfoShow(loginUid)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}