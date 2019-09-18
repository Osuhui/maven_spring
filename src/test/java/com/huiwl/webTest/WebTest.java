package com.huiwl.webTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huiwl.controller.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "spring-mybatis.xml")

public class WebTest {

	@Autowired
	private UserController userController;

	@Test
	public void test01() {

		String userName = "test01";
		userController.getUserFromUserName(userName);
	}

}
