package com.jvv.p2p.facade.em;

/**
 * Created by cx on 2015/5/25.
 */
public enum  SmsChanel {
    sms(0),
    voice(1),
    ;

    private final int value;

    private SmsChanel(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
