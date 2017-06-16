package com.jvv.p2p.biz.sinapay;

import com.jvv.p2p.facade.SinaPayService;
import com.jvv.p2p.facade.request.SinaPayWithDrawRequest;
import com.jvv.p2p.facade.request.SyncStateRequest;
import com.jvv.p2p.facade.response.sinapay.APIResponseT;
import com.jvv.p2p.integrate.longkin.LkSinaPayService;

import javax.annotation.Resource;
import javax.inject.Named;
import java.io.IOException;

/**
 * Created by linxm on 2016/8/8.
 */
@Named("sinaPayService")
public class SinaPayServiceImpl implements SinaPayService{

    @Resource
    private LkSinaPayService lkSinaPayService;

    @Override
    public APIResponseT sinaPayPwdSet(String loginUid) throws IOException {
        return lkSinaPayService.sinaPayPwdSet(loginUid);
    }

    @Override
    public APIResponseT sinaPayPwdModify(String loginUid) throws IOException {
        return lkSinaPayService.sinaPayPwdModify(loginUid);
    }

    @Override
    public APIResponseT sinaPayPwdFind(String loginUid) throws IOException {
        return lkSinaPayService.sinaPayPwdFind(loginUid);
    }

    @Override
    public APIResponseT syncSinaState(SyncStateRequest syncStateRequest) throws IOException {
        return lkSinaPayService.syncSinaState(syncStateRequest);
    }

    @Override
    public APIResponseT sinaPayWithdraw(SinaPayWithDrawRequest request) throws IOException {
        return lkSinaPayService.sinaPayWithdraw(request);
    }
}
