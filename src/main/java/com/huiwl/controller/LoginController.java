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

	/**
	 * 登录check
	 * @param webDto
	 * @return
	 */
	private LoginWebDto loginCheck(LoginWebDto webDto) {
		boolean loginCheck = true;

		// 必须check
		if (webDto.getUserName() == null || webDto.getUserName() == "") {

			loginCheck = false;
			webDto.setErrMsg("用户名不能为空！");
		}
		if (webDto.getUserPwd() == null || webDto.getUserPwd() == "") {
			loginCheck = false;
			webDto.setErrMsg("密码不能为空！");
		}

		webDto.setLoginCheck(loginCheck);
		return webDto;

	}

	// 登录
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(LoginWebDto webDto) {

		ModelAndView mad = new ModelAndView();

		// 对参数进行check
		loginCheck(webDto);

		if (!webDto.getLoginCheck()) {

			mad.addObject("loginWebDto", webDto);
			mad.setViewName("../login");
			return mad;
		}
		// Dto转换
		webDtoTodto(webDto, userDto);
		// 进行登陆处理
		loginService.login(userDto);
		// Dto转换
		dtoTowebDto(userDto, webDto);

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

	}

}
