package com.huiwl.util.factory;

import com.huiwl.service.UserService;
import com.huiwl.service.impl.UserServiceImpl;

public class StaticBeanFactory {

	public static UserService createService() {

		return new UserServiceImpl();

	}

}
