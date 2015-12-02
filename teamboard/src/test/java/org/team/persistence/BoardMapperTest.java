package org.team.persistence;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.team.dao.BoardMapper;
import org.team.domain.BoardVO;

public class BoardMapperTest extends DataSourceTest {

	@Autowired
	private BoardMapper mapper;

	@Test
	public void listTest() throws Exception{
		mapper.list();
	}
	
	@Test
	public void createTest() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setTitle("집에 언제가지");
		vo.setContent("집에 가고싶다.");
		vo.setWriter("1090");
		mapper.create(vo);
	}
	
	@Test
	public void readTest() throws Exception{
		System.out.println(mapper.read(117));
	}
	
	@Test
	public void update() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setBno(117);
		vo.setTitle("update");
		vo.setContent("update");
		vo.setWriter("update");
		mapper.update(vo);
	}

	@Test
	public void delete() throws Exception{
		mapper.delete(117);
	}
}
