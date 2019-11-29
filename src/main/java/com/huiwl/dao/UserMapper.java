package com.huiwl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiwl.dto.PageInfoDto;
import com.huiwl.dto.UserDto;

public interface UserMapper {

	// 添加一个用户
	public int addUser(@Param("user") UserDto user);

	// 根据用户名查询用户信息
	public List<UserDto> getUserFromUserName(@Param("userName") String userName);

	// 根据用户分組查询用户信息
	public List<UserDto> getUserFromGroupCd(@Param("groupCd") String groupCd);

	// 根据用户ID查找用户信息
	public UserDto getUserFromUserId(@Param("userId") String userId);

	// 根据用户ID修改用户信息
	public int updateUser(@Param("user") UserDto user);

	// 删除此用户
	public void deleteUser(@Param("userId") String userId);

	// 分页
	public List<UserDto> getUserFromIndex(@Param("pageInfo") PageInfoDto pageInfo);
}
