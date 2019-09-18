package com.huiwl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiwl.dto.User;

public interface UserMapper {

	// 添加一个用户
	public int addUser(@Param("user") User user);

	// 根据用户名查询用户信息
	public List<User> getUserFromUserName(String userName);

	// 根据用户分組查询用户信息
	public List<User> getUserFromGroupCd(String groupCd);

	// 根据用户ID查找用户信息
	public User getUserFromUserId(String userId);

	// 根据用户ID修改用户信息
	public int updateUser(@Param("user") User user);

	// 删除此用户
	public void deleteUser(String userId);;
}
