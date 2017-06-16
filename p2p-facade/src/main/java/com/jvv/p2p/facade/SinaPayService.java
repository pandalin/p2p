package com.jvv.p2p.facade;

import com.jvv.p2p.facade.request.SinaPayWithDrawRequest;
import com.jvv.p2p.facade.request.SyncStateRequest;
import com.jvv.p2p.facade.response.sinapay.APIResponseT;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.IOException;

/**
 * Created by linxm on 2016/8/8.
 */
@WebService
public interface SinaPayService {

    /**
     * 3.20	设置支付密码
     * @param loginUid
     * @return
     * @throws IOException
     */
    @WebMethod
    APIResponseT sinaPayPwdSet(String loginUid) throws IOException;

    /**
     * 3.21	修改支付密码longkin.user.m_sinapay_password_modify
     * @param loginUid
     * @return
     * @throws IOException
     */
    @WebMethod
    APIResponseT sinaPayPwdModify(String loginUid) throws IOException;

    /**
     * 3.22	找回支付密码longkin.user.m_sinapay_password_find
     * @param loginUid
     * @return
     * @throws IOException
     */
    @WebMethod
    APIResponseT sinaPayPwdFind(String loginUid) throws IOException;

    /**
     * 3.30	同步新浪状态longkin.user.m_sina_sync_state
     * @param syncStateRequest
     * @return
     * @throws IOException
     */
    @WebMethod
    APIResponseT syncSinaState(SyncStateRequest syncStateRequest) throws IOException;

    /**
     * 3.26	sina托管提现longkin.user.m_sinapay_create_hosting_withdraw
     * @param request
     * @return
     * @throws IOException
     */
    @WebMethod
    APIResponseT sinaPayWithdraw(SinaPayWithDrawRequest request) throws IOException;
}
