package com.jvv.p2p.biz.user;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.common.base.Preconditions;
import com.google.common.eventbus.Subscribe;
import com.jvv.p2p.dao.ExtUserDtoMapper;
import com.jvv.p2p.entity.ExtUserDto;
import com.jvv.p2p.entity.ExtUserDtoExample;
import com.jvv.p2p.facade.em.Activity;
import com.jvv.p2p.facade.response.user.Userallinfot;
import com.jvv.p2p.facade.vo.User;

@Named
public class UserDtoServiceImpl implements UserDtoService {

	@Inject
	private ExtUserDtoMapper extUserDtoMapper;
	@Inject
	private ExtUserDtoConvert extUserDtoConvert;

	private Log log = LogFactory.getLog(this.getClass());

	@Override
	public int insert(ExtUserDto dto) {
		// TODO 设置默认值
		Preconditions.checkNotNull(dto);

		dto.setId(UUID.randomUUID().toString());
		dto.setActivity(Activity.Y.name());

		extUserDtoMapper.insertSelective(dto);

		return 0;
	}

	@Subscribe
	public void lkRegistSuc(User u) {
		ExtUserDto dto = extUserDtoConvert.convert(u);
		insert(dto);

	}

	@Subscribe
	public void lkLoginSuc(Userallinfot u) {
		//TODO 

	}

	@Override
	public ExtUserDto get(String id) {
		return extUserDtoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ExtUserDto> query(ExtUserDto qry) {

		ExtUserDtoExample ex = new ExtUserDtoExample();
		if (qry != null) {
			ExtUserDtoExample.Criteria or = ex.or();
			if (StringUtils.isNotEmpty(qry.getExtUserId())) {
				or.andExtUserIdEqualTo(qry.getExtUserId());
			}
			//TODO 补全查询条件
		}

		return extUserDtoMapper.selectByExample(ex);
	}

	@Override
	public ExtUserDto getByExtUserId(String extUserId) {
		ExtUserDto qry = new ExtUserDto();
		qry.setExtUserId(extUserId);
		
		List<ExtUserDto> list = this.query(qry);
		if (CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public ExtUserDto getByExtPhone(String phone) {
		ExtUserDtoExample ex = new ExtUserDtoExample();
		ex.createCriteria().andPhoneEqualTo(phone);
		List<ExtUserDto> list = extUserDtoMapper.selectByExample(ex);
		if (CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}
		return null;
	}
}
