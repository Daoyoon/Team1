package org.team1.domain;

public class Criteria {

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
	
	
	public Criteria(Integer page,Integer totalCount) {
		this.next=true;
		this.prev=false;
		this.perListNum=15;
		this.perPagenum=5;
		makeCriteria(page,totalCount);
	}


	private void makeCriteria(Integer page, Integer totalCount) {
		if(page==null){
			this.page=1;
		}
		if(totalCount == null){
			this.totalCount = 0;
		}
		this.endpage=(int)(((int)Math.ceil(page/perPagenum))*perPagenum);
		this.startpage = (int) (endpage-perPagenum+1);
		if(startpage != 1){
			prev = true;
		}
		if(endpage <= totalCount){
			
		}
		}
}