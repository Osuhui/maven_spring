package com.huiwl.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiwl.dao.UserMapper;
import com.huiwl.dto.PageInfoDto;
import com.huiwl.dto.UserDto;
import com.huiwl.service.IndexService;

@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	private UserMapper userMapper;

	// Log
	private static Log log = LogFactory.getLog(IndexServiceImpl.class);

	/**
	 * 按照条件查找用户
	 *
	 * @param user 用户
	 * @return UserDto 用户Dto
	 */
	@Override
	public List<UserDto> userInfo(PageInfoDto pageInfo) {

		if (log.isInfoEnabled()) {
			log.info("◇IndexServiceImpl#userInfo -S");
		}

		// 按照条件查找用户
		List<UserDto> userList = userMapper.getUserFromIndex(pageInfo);

		if (log.isInfoEnabled()) {
			log.info("◇IndexServiceImpl#userInfo -E");
		}

		return userList;
	}
}
