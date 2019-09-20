package com.mr.take.common;


public class Page {

	//当前页
	private Integer page=1;
	//每页条数
	private Integer rows=4;
	//开始下标
	private Integer startPage;
	//排序
	private String sort;
	private String order;
	
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getStartPage() {
		startPage=(page-1)*rows;
		return startPage;
	}
	
	@Override
	public String toString() {
		return "Page [page=" + page + ", rows=" + rows + ", startPage=" + startPage + ", sort=" + sort + ", order="
				+ order + "]";
	}
}
