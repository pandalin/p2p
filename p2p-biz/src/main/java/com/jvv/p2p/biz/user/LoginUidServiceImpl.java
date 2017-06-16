package com.jvv.p2p.biz.user;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.data.redis.core.RedisTemplate;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimaps;
import com.jvv.p2p.entity.ExtUserDto;
import com.jvv.p2p.facade.LoginUidService;
import com.jvv.p2p.util.RedisKey;

/**
 * 
 * 
 * user_id 对应多个 login_uid 每个 login_uid都有实效
 * 
 * @author cx
 *
 */
@Named("loginUidService")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class LoginUidServiceImpl implements LoginUidService {

	@Inject
	private RedisTemplate<String, ListMultimap<String, String>> redisTemplate;

	@Inject
	private UserDtoService userDtoService;

	@PostConstruct
	public void init() {
		ListMultimap<String, String> uidMap = ArrayListMultimap.create();
		redisTemplate.opsForValue().set(RedisKey.LOGIN_KEY, uidMap);
	}

	@Override
	public void create(String userId, final String loginUid) {
		ListMultimap<String, String> uidMap = redisTemplate.opsForValue().get(RedisKey.LOGIN_KEY);

		uidMap.put(userId, loginUid);
		redisTemplate.opsForValue().set(RedisKey.LOGIN_KEY, uidMap);
		return;
	}

	@Override
	public void record(String oldLoginUid, String newLoginUid) {

		String userId = getIdByLoginUid(oldLoginUid);
		if (userId == null) {
			return;
		}
		ListMultimap<String, String> uidMap = redisTemplate.opsForValue().get(RedisKey.LOGIN_KEY);

		uidMap.put(userId, newLoginUid);
		redisTemplate.opsForValue().set(RedisKey.LOGIN_KEY, uidMap);

	}

	@Override
	public String getIdByLoginUid(String loginUid) {
		//key value 反转
		ListMultimap<String, String> uidMap = redisTemplate.opsForValue().get(RedisKey.LOGIN_KEY);

		ArrayListMultimap<String, String> invert = Multimaps.invertFrom(uidMap, ArrayListMultimap.<String, String> create());

		//通过 value找到key
		List<String> uid = invert.get(loginUid);

		if (CollectionUtils.isEmpty(uid)) {
			return null;
		}

		return uid.get(0);
	}

	@Override
	public String getUserIdByLoginUid(String loginUid) {
		String extUserId = this.getIdByLoginUid(loginUid);

		ExtUserDto user = userDtoService.getByExtUserId(extUserId);

		return user.getUserId();
	}

}
