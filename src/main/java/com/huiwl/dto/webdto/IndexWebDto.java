package com.huiwl.dto.webdto;

import java.util.List;

import com.huiwl.dto.PageInfoDto;
import com.huiwl.dto.UserDto;

public class IndexWebDto extends PageInfoDto {

	/** 用户id*/
	private String userId;

	/** 用戶管理*/
	private List<UserDto> userList;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<UserDto> getUserList() {
		return userList;
	}

	public void setUserList(List<UserDto> userList) {
		this.userList = userList;
	}

}
