package com.huiwl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiwl.dao.UserMapper;
import com.huiwl.dto.User;
import com.huiwl.service.LoginService;
import com.huiwl.util.constant.LoginConstant;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private LoginConstant loginConstant;

	@Override
	public User login(User user) {

		// 登录状态
		String status = null;

		// 查找出所有该名字的用户
		List<User> userList = userMapper.getUserFromUserName(user.getName());

		if (userList != null && userList.size() != 0) {
			for (User userInfo : userList) {

				if (user.getPassword().equals(userInfo.getPassword())) {
					// 登陸成功
					status = loginConstant.LOGIN_STATUS_0;
					user.setStatus(status);
					return user;
				} else {
					continue;
				}

			}

		} else {
			// 登陸失败
			status = loginConstant.LOGIN_STATUS_2;
		}

		// 登陸失败
		status = loginConstant.LOGIN_STATUS_1;
		user.setStatus(status);

		return user;

	}

}
