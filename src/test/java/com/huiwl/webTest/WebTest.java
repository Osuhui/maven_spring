package com.huiwl.webTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huiwl.controller.UserController;

public class WebTest {

	String xmlPath = "com/huiwl/webTest/spring-config.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

	@Test
	public void test01() {

		UserController userController = applicationContext.getBean("userController", UserController.class);
		// WEB测试
		userController.addUser();
	}

}
