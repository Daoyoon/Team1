package org.team1.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.team1.domain.BoardVO;

@Repository
public class BoardMapperImpl extends AbstractCRUDMapper<BoardVO, Integer> implements BoardMapper {

	@Override
	public List<BoardVO> listpage() throws Exception {

		return session.selectList(namespace+".listpage");
	}

}
