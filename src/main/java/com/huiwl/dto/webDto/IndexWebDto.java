package com.huiwl.dto.webDto;

import java.util.List;

import com.huiwl.dto.UserDto;

public class IndexWebDto {

	/** 用户id*/
	private String userId;

	/** page番号*/
	private String pageNo;

	/** 每页显示件数*/
	private String pagingCurCount;

	/** 每页第一条数据index*/
	private String pageCurRecFstIdx;

	/** 用戶管理*/
	private List<UserDto> userList;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPagingCurCount() {
		return pagingCurCount;
	}

	public void setPagingCurCount(String pagingCurCount) {
		this.pagingCurCount = pagingCurCount;
	}

	public String getPageCurRecFstIdx() {
		return pageCurRecFstIdx;
	}

	public void setPageCurRecFstIdx(String pageCurRecFstIdx) {
		this.pageCurRecFstIdx = pageCurRecFstIdx;
	}

	public List<UserDto> getUserList() {
		return userList;
	}

	public void setUserList(List<UserDto> userList) {
		this.userList = userList;
	}

}
