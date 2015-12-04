package org.team1.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.team1.domain.BoardVO;
import org.team1.domain.Criteria;
import org.team1.persistence.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService<BoardVO, Integer> {

	@Inject
	private BoardMapper mapper;

	@Override
	public List<BoardVO> listAll() throws Exception {
		return mapper.listAll();
	}

	@Override
	public void create(BoardVO vo) throws Exception {
		mapper.create(vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return mapper.read(bno);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		mapper.delete(bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		mapper.update(vo);
	}

	@Override
	public void hit(Integer bno) throws Exception {
			mapper.hit(bno);
	}

	@Override
	public int searchCount(Criteria cri) throws Exception {
		return mapper.searchCount(cri);
		
	}

	@Override
	public List<BoardVO> search(Criteria cri) throws Exception {
		return mapper.search(cri);
	}
}