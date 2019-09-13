package com.huiwl.dao;

import java.util.List;

import com.huiwl.dto.User;

public interface UserMapper {

	public List<User> getUserFromUserName(String userName);

	public User getUserInfo(String userId);

}
