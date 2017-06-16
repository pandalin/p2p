package com.jvv.p2p.biz.sys;

/**
 * Created by cx on 2015/5/29.
 */
public enum DataModel {

    local("local"),//本地数据
    remote("remote"),//远端数据
    ;

    private final String value;

    private DataModel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
