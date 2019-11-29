package com.huiwl.dto;

import org.springframework.stereotype.Component;

@Component
public class PageInfoDto {

	/** 总件数*/
	private Long totalRecNum;

	/** 总页数*/
	private Long totalPageNum;

	/** page番号*/
	private Long pageNo;

	/** 每页显示件数*/
	private Long pagingCurCount;

	/** 每页第一条数据index*/
	private Long pageCurRecFstIdx;

	public Long getTotalRecNum() {
		return totalRecNum;
	}

	public void setTotalRecNum(Long totalRecNum) {
		this.totalRecNum = totalRecNum;
	}

	public Long getTotalPageNum() {
		return totalPageNum;
	}

	public void setTotalPageNum(Long totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Long getPageNo() {
		return pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPagingCurCount() {
		return pagingCurCount;
	}

	public void setPagingCurCount(Long pagingCurCount) {
		this.pagingCurCount = pagingCurCount;
	}

	public Long getPageCurRecFstIdx() {
		return pageCurRecFstIdx;
	}

	public void setPageCurRecFstIdx(Long pageCurRecFstIdx) {
		this.pageCurRecFstIdx = pageCurRecFstIdx;
	}

}
