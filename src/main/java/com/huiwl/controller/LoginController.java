package com.huiwl.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.huiwl.dto.UserDto;
import com.huiwl.dto.webdto.LoginWebDto;
import com.huiwl.service.LoginService;
import com.huiwl.util.constant.LoginConstant;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private UserDto userDto;

	// Log
	private static Log log = LogFactory.getLog(LoginController.class);

	// 登录
	@PostMapping(value = "/login")
	public String login(LoginWebDto loginWebDto, RedirectAttributes attr) {

		if (log.isInfoEnabled()) {
			log.info("◇LoginController#login -S");
		}

		// Dto转换
		webDtoTodto(loginWebDto, userDto);

		// 进行登陆处理
		loginService.login(userDto);

		// Dto转换
		dtoTowebDto(userDto, loginWebDto);

		// login失败时自画面迁移
		if (loginWebDto.getErrMsg() != null) {
			return "../login";
		}

		if (log.isInfoEnabled()) {
			log.info("◇LoginController#login -E");
		}

		attr.addFlashAttribute("userId", userDto.getId());
		return "redirect:index";
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
