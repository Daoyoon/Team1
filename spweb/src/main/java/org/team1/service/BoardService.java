package org.team1.service;

import java.util.List;

import org.team1.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> listAll() throws Exception;
	
}
