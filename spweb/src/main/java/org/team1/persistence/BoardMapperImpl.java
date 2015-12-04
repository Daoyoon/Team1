package org.team1.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.team1.domain.BoardVO;
import org.team1.domain.Criteria;

@Repository
public class BoardMapperImpl extends AbstractCRUDMapper<BoardVO, Integer> implements BoardMapper {

	@Override
	public List<BoardVO> listpage(int page) throws Exception {

		return session.selectList(namespace+".listpage",page);
	}

	@Override
	public void hit(Integer bno) throws Exception {
		
		session.update(namespace+".hit",bno);
		
	}

	@Override
	public int totalcount() throws Exception {
		return session.selectOne(namespace+".totalcount");
		
	}

	@Override
	public List<BoardVO> search(Criteria cri) throws Exception {
		return session.selectList(namespace+".search",cri);
	}

}
