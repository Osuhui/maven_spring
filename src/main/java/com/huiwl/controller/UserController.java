package com.huiwl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.huiwl.service.UserService;

@Controller("userController")
public class UserController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	public void addUser() {
		System.out.println("....Start....");
		userService.addUser();
	}
}
