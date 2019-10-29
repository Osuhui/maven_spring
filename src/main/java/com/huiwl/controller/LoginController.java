package com.huiwl.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.huiwl.dto.UserDto;
import com.huiwl.dto.webDto.LoginWebDto;
import com.huiwl.service.LoginService;
import com.huiwl.util.constant.LoginConstant;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private UserDto userDto;

	private static Log log = LogFactory.getLog(LoginController.class);

	// 登录
	@PostMapping(value = "login")
	public ModelAndView login(LoginWebDto loginWebDto) {

		ModelAndView mad = new ModelAndView("index");

		// Dto转换
		webDtoTodto(loginWebDto, userDto);
		// 进行登陆处理
		log.info("登录处理开始");
		//		loginService.login(userDto);
		log.info("登录处理结束");
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

		if (LoginConstant.LOGIN_STATUS_1.equals(userDto.getStatus())) {
			webDto.setErrMsg("用户名或密码错误，重新输入！");
		} else if (LoginConstant.LOGIN_STATUS_2.equals(userDto.getStatus())) {
			webDto.setErrMsg("该用户不存在！");
		}

	}

}
