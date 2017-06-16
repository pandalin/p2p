package com.jvv.p2p.biz.user;

import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.jvv.p2p.entity.ExtUserDto;
import com.jvv.p2p.facade.response.user.Userbaseinfot;
import com.jvv.p2p.facade.vo.User;

@Named
public class ExtUserDtoConvert {

	public ExtUserDto convert(Userbaseinfot orig) {
		ExtUserDto dest = new ExtUserDto();
		BeanUtils.copyProperties(orig, dest);

		return dest;
	}

	public ExtUserDto convert(User orig) {
		ExtUserDto dest = new ExtUserDto();
		BeanUtils.copyProperties(orig, dest);
		dest.setPhone(orig.getPhone());
		dest.setPassword(orig.getPassword());
		dest.setExtUserId(orig.getExtUserId());

		return dest;
	}

}
