package com.jvv.p2p.biz.user;

import java.util.List;

import com.jvv.p2p.entity.ExtUserDto;

/**
 * 本地用户数据库
 * 
 * @author cx
 *
 */
public interface UserDtoService {

	/**
	 * 新增用户
	 * 
	 * @param extUserDto
	 * @return
	 */
	int insert(ExtUserDto extUserDto);

	/**
	 * 通过extUserId得到 jvv_user_id
	 * 
	 * @param id
	 * @return
	 */
	ExtUserDto get(String id);
	
	
	/**
	 * 查询
	 * 
	 * @param qry
	 * @return
	 */
	List<ExtUserDto> query(ExtUserDto qry);
	
	/**
	 * 通过 extUserId查询  记录
	 * 
	 * @param extUserId
	 * @return
	 */
	ExtUserDto getByExtUserId(String extUserId);
	
	
	/***
	 * 
	 * 通过手机查询
	 * */
	ExtUserDto getByExtPhone(String phone);
}
