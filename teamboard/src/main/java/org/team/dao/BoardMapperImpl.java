package org.team.dao;

import org.springframework.stereotype.Repository;
import org.team.domain.BoardVO;
import org.team.persistence.AbstractCRUDMapper;


@Repository
public class BoardMapperImpl extends AbstractCRUDMapper<BoardVO, Integer> implements BoardMapper {
	
}
