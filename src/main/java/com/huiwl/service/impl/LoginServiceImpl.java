package com.huiwl.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiwl.dao.UserMapper;
import com.huiwl.dto.UserDto;
import com.huiwl.service.LoginService;
import com.huiwl.util.constant.LoginConstant;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;

	// Log
	private static Log log = LogFactory.getLog(LoginServiceImpl.class);

	/**
	 * 登录处理
	 *
	 * @param user 用户
	 * @return UserDto 用户Dto
	 */
	@Override
	public UserDto login(UserDto user) {

		if (log.isInfoEnabled()) {
			log.info("◇LoginServiceImpl#login -S");
		}

		// 获取所有该name的用户信息
		List<UserDto> userList = userMapper.getUserFromUserName(user.getName());

		if (userList != null && !userList.isEmpty()) {
			for (UserDto userInfo : userList) {

				if (user.getPassword().equals(userInfo.getPassword())) {
					// 登陸成功
					user.setStatus(LoginConstant.LOGIN_STATUS_0);
				} else {
					// 用户名和密码不匹配
					user.setStatus(LoginConstant.LOGIN_STATUS_1);
				}
			}
		} else {
			// 没有该用户
			user.setStatus(LoginConstant.LOGIN_STATUS_2);
		}

		if (log.isInfoEnabled()) {
			log.info("◇LoginServiceImpl#login -E");
		}

		return user;

	}
}
