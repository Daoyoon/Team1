package org.team1.domain;

public class Criteria {

	private int pageNo;
	private String searchType;
	private String keyword;	
	private int perPage;
	
	
	public Criteria(){
		this.pageNo = 1;
		this.perPage = 10;
	}


	public int getPageNo() {
		return pageNo;
	}


	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}


	public String getSearchType() {
		return searchType;
	}


	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}


	public String getKeyword() {
		return keyword;
	}


	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}


	public int getPerPage() {
		return perPage;
	}


	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}


	@Override
	public String toString() {
		return "Criteria [pageNo=" + pageNo + ", searchType=" + searchType + ", keyword=" + keyword + ", perPage="
				+ perPage + "]";
	}

	


	
	
}