package com.jvv.p2p.facade.em;

/**
 * Created by cx on 2015/5/25.
 */
public enum SmsType {
    /*
    0	前端注册
    1	前端借款需求
    2	绑定手机号
    3	修改手机号
    4	投资发送验证码
    5	忘记密码
    6	还款发送验证码
    7	提现发送验证码
    8	内部发送验证码
    9	随机码登录
    13	体验标投资
    */
    regist(0),
    loan(1),
    bind_phone(2),
    edit_phone(3),
    invest(4),
    forget_password(5),
    repay(6),
    withdraw(7),
    inner(8),
    random_login(9),
    invest_experience(13)
    ;

    private final int value;

    private SmsType(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }


}
