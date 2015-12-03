package org.team1.persistence;

import java.util.List;

import org.team1.domain.BoardVO;

public interface BoardMapper extends CRUDMapper<BoardVO, Integer> {

	public List<BoardVO> listpage() throws Exception;
}
