package org.team1.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.team1.domain.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {

//	@Autowired
//	private BoardService service;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String listAll(Model model)throws Exception{
		logger.info("list........");
		
		List<BoardVO> lists = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
		
			BoardVO vo = new BoardVO();
			vo.setBno(i+1);
			vo.setContent("\\#"
					+"AAA");
			vo.setHit(30+i);
			vo.setRegdate(new Date(2015, 3, 1));
			vo.setUpdatedate(vo.getRegdate());
			vo.setTitle("title"+i);
			vo.setWriter("woonsik");
			System.out.println(vo.toString());
			lists.add(vo);
		}
		
		model.addAttribute("list",lists);
//		model.addAttribute("list", service.listAll());
		
		return "/board/list";
	}
	
	@RequestMapping(value="/view", method = RequestMethod.GET)
	public String view(Model model)throws Exception{
	
		BoardVO vo = new BoardVO();
		vo.setBno(1);
		vo.setContent("\\#"
				+"AAA");
		vo.setHit(30);
		vo.setRegdate(new Date(2015, 3, 1));
		vo.setUpdatedate(vo.getRegdate());
		vo.setTitle("title");
		vo.setWriter("woonsik");
		System.out.println(vo.toString());
		
	model.addAttribute("board", vo);
		
		return "/board/view";
	}
}
