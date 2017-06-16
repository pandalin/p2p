package com.jvv.p2p.biz.product;

import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.jvv.p2p.entity.DemandDto;
import com.jvv.p2p.facade.response.product.Demandinfot;

@Named
public class DemandDtoConvert {

	public DemandDto convert(Demandinfot orig) {
		DemandDto dest = new DemandDto();
		BeanUtils.copyProperties(orig, dest, "id");

		//设置id
		dest.setExtId(orig.getId());

		return dest;
	}
}
