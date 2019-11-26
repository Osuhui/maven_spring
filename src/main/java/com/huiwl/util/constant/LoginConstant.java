package com.huiwl.util.constant;

import org.springframework.stereotype.Component;

@Component
public class LoginConstant {
	private LoginConstant() {

	}

	// 0:登陆成功
	public static final String LOGIN_STATUS_0 = "0";

	// 1:用户名和密码不匹配
	public static final String LOGIN_STATUS_1 = "1";

	// 2:该用户没有注册
	public static final String LOGIN_STATUS_2 = "2";

	// test
	public static final String LOGIN = "TEST";
}
