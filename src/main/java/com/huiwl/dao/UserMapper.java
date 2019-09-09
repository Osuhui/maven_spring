package com.huiwl.dao;

import org.apache.ibatis.annotations.Mapper;

import com.huiwl.dto.User;

@Mapper
public interface UserMapper {

	public User getUser(String userName);
}
