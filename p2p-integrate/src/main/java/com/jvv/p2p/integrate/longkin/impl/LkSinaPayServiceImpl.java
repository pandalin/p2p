package com.jvv.p2p.integrate.longkin.impl;

import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.request.SinaPayWithDrawRequest;
import com.jvv.p2p.facade.request.SyncStateRequest;
import com.jvv.p2p.facade.response.sinapay.APIResponseT;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.LkSinaPayService;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;
import com.jvv.p2p.util.XmlUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Named;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by linxm on 2016/8/8.
 */
@Named
public class LkSinaPayServiceImpl implements LkSinaPayService {

    @Resource
    private LkClient lkClient;

    @Resource
    private ResultConvert resultConvert;

    @Override
    public APIResponseT sinaPayPwdSet(final String loginUid) throws IOException {

        final String setSinaPwdUrl = "longkin.user.m_sinapay_password_set";
        RequestHead head = new RequestHead(setSinaPwdUrl);

        LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
            {
                put("login_uid", loginUid);
            }
        });

        return apiResponseTRep(response);

    }

    private APIResponseT apiResponseTRep(LkResponse lkResponse) {
        APIResponseT body = new APIResponseT();
        if (lkResponse.isSuc()) {
            String bodyxml = lkResponse.getBody();

            body = XmlUtil.parse(bodyxml,APIResponseT.class);
        }
        body.setResult(resultConvert.convert(lkResponse.getHead()));
        return body;
    }

    @Override
    public APIResponseT sinaPayPwdModify(final String loginUid) throws IOException {
        final String modifySinaPwdUrl = "longkin.user.m_sinapay_password_modify";
        RequestHead head = new RequestHead(modifySinaPwdUrl);

        LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
            {
                put("login_uid", loginUid);
            }
        });

        return apiResponseTRep(response);
    }

    @Override
    public APIResponseT sinaPayPwdFind(final String loginUid) throws IOException {
        final String findSinaPwdUrl = "longkin.user.m_sinapay_password_find";
        RequestHead head = new RequestHead(findSinaPwdUrl);

        LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
            {
                put("login_uid", loginUid);
            }
        });

        return apiResponseTRep(response);
    }

    @Override
    public APIResponseT syncSinaState(SyncStateRequest syncStateRequest) throws IOException {
        final String syncStateUrl = "longkin.user.m_sina_sync_state";
        RequestHead head = new RequestHead(syncStateUrl);

        LkResponse response = lkClient.send(head, syncStateRequest);

        return apiResponseTRep(response);
    }

    @Override
    public APIResponseT sinaPayWithdraw(SinaPayWithDrawRequest request) throws IOException {

        final String withDrawUrl = "longkin.user.m_sinapay_create_hosting_withdraw";
        RequestHead head = new RequestHead(withDrawUrl);
        request.setSessionId(UUID.randomUUID().toString());
        LkResponse response = lkClient.send(head, request);

        return apiResponseTRep(response);
    }

    @Override
    public APIResponseT deposit(final String loginUid, final BigDecimal amount) throws IOException {
        final String depositUrl = "longkin.user.m_sinapay_create_hosting_deposit";
        RequestHead head = new RequestHead(depositUrl);

        LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
            {
                put("login_uid", loginUid);
                put("sessionid", UUID.randomUUID().toString());
                put("amount", amount.toString());
            }
        });
        return apiResponseTRep(response);
    }

    @Override
    public APIResponseT userInfoShow(final String loginUid) throws IOException {
        final String depositUrl = "longkin.user.m_sinapay_infos_show";
        RequestHead head = new RequestHead(depositUrl);

        LkResponse response = lkClient.send(head, null, new HashMap<String, String>() {
            {
                put("login_uid", loginUid);
            }
        });
        return apiResponseTRep(response);
    }
}
