package com.jvv.p2p.integrate.longkin;

import com.jvv.p2p.facade.request.SinaPayWithDrawRequest;
import com.jvv.p2p.facade.request.SyncStateRequest;
import com.jvv.p2p.facade.response.sinapay.APIResponseT;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by linxm on 2016/8/8.
 */
public interface LkSinaPayService {

    /**
     * 3.20	设置支付密码longkin.user.m_sinapay_password_set
     * @param loginUid
     * @return
     * @throws IOException
     */
    APIResponseT sinaPayPwdSet(String loginUid) throws IOException;

    /**
     * 3.21	修改支付密码longkin.user.m_sinapay_password_modify
     * @param loginUid
     * @return
     * @throws IOException
     */
    APIResponseT sinaPayPwdModify(String loginUid) throws IOException;

    /**
     * 3.22	找回支付密码longkin.user.m_sinapay_password_find
     * @param loginUid
     * @return
     * @throws IOException
     */
    APIResponseT sinaPayPwdFind(String loginUid) throws IOException;

    /**
     * 3.30	同步新浪状态longkin.user.m_sina_sync_state
     * @param syncStateRequest
     * @return
     * @throws IOException
     */
    APIResponseT syncSinaState(SyncStateRequest syncStateRequest) throws IOException;

    /**
     * 3.26	sina托管提现longkin.user.m_sinapay_create_hosting_withdraw
     * @param request
     * @return
     * @throws IOException
     */
    APIResponseT sinaPayWithdraw(SinaPayWithDrawRequest request) throws IOException;

    /**
     * 新浪托管充值
     * @param loginUid
     * @param amount
     * @return
     * @throws IOException
     */
    APIResponseT deposit(String loginUid, BigDecimal amount) throws IOException;

    /**
     * 3.27	Sina用户信息展示
     * @param loginUid longkin.user.m_sinapay_infos_show
     * @return
     * @throws IOException
     */
    APIResponseT userInfoShow(String loginUid) throws IOException;
}
