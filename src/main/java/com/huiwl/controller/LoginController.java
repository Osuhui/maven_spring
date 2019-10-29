package com.huiwl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView login(LoginWebDto loginWebDto) {

		ModelAndView mad = new ModelAndView("index");

		// Dto转换
		webDtoTodto(loginWebDto, userDto);
		// 进行登陆处理
		//		loginService.login(userDto);

		userDto.setStatus("0");
		// Dto转换
		dtoTowebDto(userDto, loginWebDto);

		if (loginWebDto.getErrMsg() != null) {
			mad.setViewName("../login");
		}

		return mad;
	}

	/**
	 * webDto-->dto
	 * @param webDto
	 * @param userDto
	 */
	private void webDtoTodto(LoginWebDto webDto, UserDto userDto) {

		// 用户名
		userDto.setName(webDto.getUserName());
		// 密码
		userDto.setPassword(webDto.getUserPwd());

	}

	/**
	 * dto-->webDto
	 * @param userDto
	 * @param webDto
	 */
	private void dtoTowebDto(UserDto userDto, LoginWebDto webDto) {

		if (userDto.getStatus() == "1") {
			webDto.setErrMsg("用户名或密码错误，重新输入！");
		} else if (userDto.getStatus() == "2") {
			webDto.setErrMsg("该用户不存在！");
		}

	}

}
