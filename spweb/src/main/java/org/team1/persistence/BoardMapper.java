package org.team1.persistence;

import java.util.List;

import org.team1.domain.BoardVO;

public interface BoardMapper extends CRUDMapper<BoardVO, Integer> {

	public List<BoardVO> listpage(int page) throws Exception;
	
	public void hit(Integer bno)throws Exception;
	
	public int totalcount() throws Exception;
}
