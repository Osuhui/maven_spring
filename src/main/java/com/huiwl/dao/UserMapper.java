package com.huiwl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiwl.dto.UserDto;

public interface UserMapper {

	// 添加一个用户
	public int addUser(@Param("user") UserDto user);

	// 根据用户名查询用户信息
	public List<UserDto> getUserFromUserName(String userName);

	// 根据用户分組查询用户信息
	public List<UserDto> getUserFromGroupCd(String groupCd);

	// 根据用户ID查找用户信息
	public UserDto getUserFromUserId(String userId);

	// 根据用户ID修改用户信息
	public int updateUser(@Param("user") UserDto user);

	// 删除此用户
	public void deleteUser(String userId);;
}
