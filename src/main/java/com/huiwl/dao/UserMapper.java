package com.huiwl.dao;

import com.huiwl.dto.User;

public interface UserMapper {

	public User getUser(String userName);

	public User getUserInfo(String userId);

}
