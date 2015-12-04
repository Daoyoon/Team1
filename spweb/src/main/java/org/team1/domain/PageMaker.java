package org.team1.domain;

public class PageMaker {

	private int page;
	private int startpage;
	private int endpage;
	private int totalCount;
	
	//1페이지당 뜨는 화면 수
	private double perListNum;
	//페이지 몇개 밑에 뜨게 할지
	private double perPagenum;
	
	private boolean next;
	private boolean prev;
	
	
	public PageMaker(Integer page,Integer totalCount) {
		this.next=true;
		this.prev=false;
		this.perListNum=12;
		this.perPagenum=5;
		makeCriteria(page,totalCount);
	}


	private void makeCriteria(Integer page, Integer totalCount) {
		if(page==null){
			this.page=1;
		}else{
			this.page=page;
		}
		this.endpage=(int)((Math.ceil(this.page/perPagenum))*perPagenum);
		this.startpage = (int) (endpage-perPagenum+1);
		
		if(startpage > 1){
			prev = true;
		}
		if(totalCount == null){
			this.totalCount = 0;
			this.endpage=1;
			this.next=false;
			return;
		}else{
			this.totalCount=totalCount;
		}
		if(endpage*perListNum >= this.totalCount){
			this.next=false;
			System.out.println(totalCount/perListNum);
			this.endpage=(int)(Math.ceil(totalCount/perListNum));
		}
		
		}

	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}


	public int getStartpage() {
		return startpage;
	}


	public void setStartpage(int startpage) {
		this.startpage = startpage;
	}


	public int getEndpage() {
		return endpage;
	}


	public void setEndpage(int endpage) {
		this.endpage = endpage;
	}


	public int getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}


	public double getPerListNum() {
		return perListNum;
	}


	public void setPerListNum(int perListNum) {
		this.perListNum = perListNum;
	}


	public double getPerPagenum() {
		return perPagenum;
	}


	public void setPerPagenum(double perPagenum) {
		this.perPagenum = perPagenum;
	}


	public boolean isNext() {
		return next;
	}


	public void setNext(boolean next) {
		this.next = next;
	}


	public boolean isPrev() {
		return prev;
	}


	public void setPrev(boolean prev) {
		this.prev = prev;
	}


	@Override
	public String toString() {
		return "PageMaker [page=" + page + ", startpage=" + startpage + ", endpage=" + endpage + ", totalCount="
				+ totalCount + ", perListNum=" + perListNum + ", perPagenum=" + perPagenum + ", next=" + next
				+ ", prev=" + prev + "]";
	}
	
	
}