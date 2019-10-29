package com.huiwl.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.huiwl.service.UserService;

@Controller("userController")
public class UserController {

	@Autowired
	private UserService userService;

	private static Log log = LogFactory.getLog(UserController.class);

	//根据用户名查找
	public void getUserFromUserName(String userName) {
		log.info("........Start........");
		userService.getUserFromUserName(userName);
		log.info("........End........");
	}
}
