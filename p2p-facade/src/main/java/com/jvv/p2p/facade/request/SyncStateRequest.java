package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

/**
 * Created by linxm on 2016/8/8.同步新浪状态
 */
public class SyncStateRequest {

    /*login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
    optype	操作返回类型	int	操作返回类型	要签	非空
    order	订单号	String	订单号	要签	非空	可为字符类型空*/

    @Title("login_uid")
    private String loginUid;
    @Title("optype")
    private Integer optype;
    @Title("order")
    private String order;

    public String getLoginUid() {
        return loginUid;
    }

    public void setLoginUid(String loginUid) {
        this.loginUid = loginUid;
    }

    public Integer getOptype() {
        return optype;
    }

    public void setOptype(Integer optype) {
        this.optype = optype;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
