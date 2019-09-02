package com.huiwl.factory;

import com.huiwl.service.UserService;
import com.huiwl.service.impl.UserServiceImpl;

public class BeanFactory {

	public UserService createService() {

		return new UserServiceImpl();

	}

}
