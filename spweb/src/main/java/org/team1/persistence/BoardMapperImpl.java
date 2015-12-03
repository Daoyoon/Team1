package org.team1.persistence;

import org.springframework.stereotype.Repository;
import org.team1.domain.BoardVO;

@Repository
public class BoardMapperImpl extends AbstractCRUDMapper<BoardVO, Integer> implements BoardMapper {

}
