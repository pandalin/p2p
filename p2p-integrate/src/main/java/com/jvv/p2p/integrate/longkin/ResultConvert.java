package com.jvv.p2p.integrate.longkin;

import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.integrate.longkin.response.LkResponse;
import com.jvv.p2p.integrate.longkin.response.ResponseHead;
import org.springframework.beans.BeanUtils;

import javax.inject.Inject;
import javax.inject.Named;
/**
 * Created by cx on 2015/5/27.
 */
@Named
public class ResultConvert {

    public Result convert(ResponseHead orig){
        Result dest=new Result();
        BeanUtils.copyProperties(orig,dest);

        return dest;

    }
}
