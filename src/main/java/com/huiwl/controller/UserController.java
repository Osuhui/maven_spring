package com.huiwl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.huiwl.service.UserService;

@Controller("userController")
public class UserController {

	@Autowired
	private UserService userService;

	//根据用户名查找
	public void getUserFromUserName(String userName) {
		System.out.println("........Start........");
		userService.getUserFromUserName(userName);
	}
}
