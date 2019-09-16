package com.huiwl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiwl.dto.User;
import com.huiwl.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginService loginService;

	// 根据用户名查找
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public User login(User inDto, User outDto) {

		outDto = loginService.login(inDto);

		return outDto;
	}
}
