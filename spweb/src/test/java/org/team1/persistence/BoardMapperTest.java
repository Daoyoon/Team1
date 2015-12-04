package org.team1.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.team1.domain.BoardVO;
import org.team1.domain.Criteria;
import org.team1.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class BoardMapperTest {

	protected static final Logger logger = LoggerFactory.getLogger(BoardMapperTest.class);

	@Autowired
	private BoardService service;

	@Test
	public void listTest() throws Exception {
		System.out.println(service.listAll());
	}

	@Test
	public void createTest() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setTitle("가자가자");
		vo.setContent("어데");
		vo.setWriter("놀자놀자");
		service.create(vo);
	}

	@Test

	public void searchTest() throws Exception {

		Criteria cri = new Criteria();
		cri.setPageNo(2);
		cri.setPerPage(20);
		cri.setKeyword("카페");
		cri.setSearchType("t");
		System.out.println(service.search(cri));

	}

}
