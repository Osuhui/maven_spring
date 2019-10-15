package com.huiwl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiwl.dao.UserMapper;
import com.huiwl.dto.UserDto;
import com.huiwl.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void getUserFromUserName(String userName) {

		List<UserDto> userList = userMapper.getUserFromUserName(userName);
		System.out.println(userList);
		System.out.println("........End........");
	}

}
