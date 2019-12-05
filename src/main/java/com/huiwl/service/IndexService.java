package com.huiwl.service;

import java.util.List;

import com.huiwl.dto.PageInfoDto;
import com.huiwl.dto.UserDto;

public interface IndexService {

	public List<UserDto> userInfo(PageInfoDto pageInfo);

}
