package com.huiwl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.huiwl.dto.User;
import com.huiwl.service.LoginService;

@Controller("loginController")
public class LoginController {

	@Autowired
	private LoginService loginService;

	// 根据用户名查找
	public User login(User inDto, User outDto) {

		outDto = loginService.login(inDto);

		return outDto;
	}
}
