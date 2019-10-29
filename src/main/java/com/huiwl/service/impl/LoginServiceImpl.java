package com.huiwl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiwl.dao.UserMapper;
import com.huiwl.dto.UserDto;
import com.huiwl.service.LoginService;
import com.huiwl.util.constant.LoginConstant;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDto login(UserDto user) {

		// 登录状态
		String status = null;

		// 获取所有该name的用户信息
		List<UserDto> userList = userMapper.getUserFromUserName(user.getName());

		if (userList != null && !userList.isEmpty()) {
			for (UserDto userInfo : userList) {

				if (user.getPassword().equals(userInfo.getPassword())) {
					// 登陸成功
					status = LoginConstant.LOGIN_STATUS_0;
					user.setStatus(status);
					return user;
				}
			}

		} else {
			// 登陸失败
			status = LoginConstant.LOGIN_STATUS_2;
		}

		// 登陸失败
		status = LoginConstant.LOGIN_STATUS_1;
		user.setStatus(status);

		return user;

	}

}
