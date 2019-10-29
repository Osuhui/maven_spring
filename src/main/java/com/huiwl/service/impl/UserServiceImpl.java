package com.huiwl.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiwl.dao.UserMapper;
import com.huiwl.dto.UserDto;
import com.huiwl.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	private static Log log = LogFactory.getLog(UserServiceImpl.class);

	@Override
	public void getUserFromUserName(String userName) {
		log.info("getUserFromUserName Start");
		List<UserDto> userList = userMapper.getUserFromUserName(userName);
		log.info("getUserFromUserName end"+userList);
	}

}
