package org.team1.domain;

public class PageMaker {

	private int page;
	private int startpage;
	private int endpage;
	private int totalCount;
	
	//1페이지당 뜨는 화면 수
	private int perListNum;
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
		}
		this.endpage=(int) ((Math.ceil(this.page/perPagenum))*perPagenum);
		this.startpage = (int) (endpage-perPagenum+1);
		if(startpage > 1){
			prev = true;
		}
		if(totalCount == null){
			this.totalCount = 0;
			
		}
		if(endpage*perPagenum >= this.totalCount){
			this.next=false;
			this.endpage=(int) (Math.ceil(totalCount/perListNum));
		}
		}
}