package com.huiwl.util.constant;

import org.springframework.stereotype.Component;

@Component
public class LoginConstant {
	
	// 0:登陆成功
	public final String LOGIN_STATUS_0 = "0";

	// 1:用户名和密码不匹配
	public final String LOGIN_STATUS_1 = "1";
	
	// 2:该用户没有注册
	public final String LOGIN_STATUS_2 = "2";
}
