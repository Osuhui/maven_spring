package com.huiwl.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.huiwl.dto.PageInfoDto;
import com.huiwl.dto.webDto.IndexWebDto;
import com.huiwl.service.IndexService;

@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired
	private IndexService indexService;

	@Autowired
	private PageInfoDto pageInfoDto;

	// Log
	private static Log log = LogFactory.getLog(IndexController.class);

	// 登录
	@RequestMapping(value = "index")
	public ModelAndView index(IndexWebDto indexWebDto) {

		if (log.isInfoEnabled()) {
			log.info("◇IndexController#index -S");
		}

		ModelAndView mad = new ModelAndView("index");

		pageInfoDto.setTotalRecNum(Long.parseLong("10"));
		pageInfoDto.setPageCurRecFstIdx(Long.parseLong("1"));

		// 进行登陆处理
		indexWebDto.setUserList(indexService.userInfo(pageInfoDto));

		if (log.isInfoEnabled()) {
			log.info("◇IndexController#index -E");
		}
		return mad;
	}

}
