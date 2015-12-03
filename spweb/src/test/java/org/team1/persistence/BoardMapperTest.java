package org.team1.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardMapperTest {

	protected static final Logger logger = LoggerFactory.getLogger(BoardMapperTest.class);

	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void test() throws Exception {
		System.out.println(mapper.listAll());
	}

}
