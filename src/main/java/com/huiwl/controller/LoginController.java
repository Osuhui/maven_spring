package com.huiwl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiwl.dto.UserDto;
import com.huiwl.dto.webDto.LoginWebDto;
import com.huiwl.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private UserDto userDto;

	// 登录
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(LoginWebDto dto) {

		userDto.setName(dto.getUserName());
		userDto.setPassword(dto.getUserPwd());

		// 进行登陆处理
		userDto = loginService.login(userDto);
		
		dto.setLoginStatus(userDto.getStatus());
		
		return "index";
	}

}
