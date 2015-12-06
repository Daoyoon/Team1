package org.team1.domain;

public class PageMaker {

	private int pageNo;
	private int startpage;
	private int endpage;
	private int totalCount;
	
	//1페이지당 뜨는 화면 수
	private double perListNum;
	//페이지 몇개 밑에 뜨게 할지
	private double perPagenum;
	
	private boolean next;
	private boolean prev;
	
	
	public PageMaker(Integer pageNo,Integer totalCount) {
		this.next=true;
		this.prev=false;
		this.perListNum=15;
		this.perPagenum=10;
		makePage(pageNo,totalCount);
	}


	private void makePage(Integer pageNo, Integer totalCount) {
		if(pageNo==null){
			this.pageNo=1;
		}else{
			this.pageNo=pageNo;
		}
		this.endpage=(int)((Math.ceil(this.pageNo/perPagenum))*perPagenum);
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
		return pageNo;
	}


	public void setPage(int page) {
		this.pageNo = page;
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
		return "PageMaker [pageNo=" + pageNo + ", startpage=" + startpage + ", endpage=" + endpage + ", totalCount="
				+ totalCount + ", perListNum=" + perListNum + ", perPagenum=" + perPagenum + ", next=" + next
				+ ", prev=" + prev + "]";
	}
	
	
}