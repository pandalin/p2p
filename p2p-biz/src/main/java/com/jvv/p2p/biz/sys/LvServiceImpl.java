package com.jvv.p2p.biz.sys;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;

import com.jvv.p2p.dao.DictDtoMapper;
import com.jvv.p2p.entity.DictDto;
import com.jvv.p2p.entity.DictDtoExample;

@Named
public class LvServiceImpl implements LvService {

	@Inject
	private DictDtoMapper dictDtoMapper;

	@Override
	public String getByTypeKey(String type, String key) {
		DictDtoExample ex = new DictDtoExample();
		ex.or().andDictTypeEqualTo(type).andDictKeyEqualTo(key);

		List<DictDto> ds = dictDtoMapper.selectByExample(ex);
		if (CollectionUtils.isEmpty(ds)) {
			return null;
		}

		return ds.get(0).getVal();
	}
}
