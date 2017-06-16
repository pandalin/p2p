package com.jvv.p2p.facade.response.sinapay;

import com.jvv.p2p.facade.response.Result;
import org.xmappr.Element;
import org.xmappr.RootElement;

/**
 * Created by linxm on 2016/8/8.
 */
@RootElement("apiresponset")
public class APIResponseT {

    @Element("success")
    private Boolean success;

    @Element("returnid")
    private String returnid;

    @Element("message")
    private String message;

    @Element("returntext")
    private String returnText;

    private transient Result result;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getReturnid() {
        return returnid;
    }

    public void setReturnid(String returnid) {
        this.returnid = returnid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReturnText() {
        return returnText;
    }

    public void setReturnText(String returnText) {
        this.returnText = returnText;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
