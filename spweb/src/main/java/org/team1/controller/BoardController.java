package org.team1.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.team1.domain.BoardVO;
import org.team1.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService service;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public void listAll(Model model)throws Exception{
		logger.info("list........");
		
		model.addAttribute("list",service.listpage());
//		model.addAttribute("list", service.listAll());
		
//		return "/board/list";
	}
	
	@RequestMapping(value="/view", method = RequestMethod.GET)
	public void view(int bno,Model model)throws Exception{
	
	System.out.println(bno);
		
	model.addAttribute("board", service.read(bno));
		
//		return "/board/view";
	}
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public void create()throws Exception{
		
	}
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public String createPost(BoardVO vo)throws Exception{
		System.out.println(vo.getTitle());
		service.create(vo);
		
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/modify", method = RequestMethod.GET)
	public void modify(int bno,Model model)throws Exception{
		System.out.println(bno);
		model.addAttribute("board", service.read(bno));
	}
	@RequestMapping(value="/modify", method = RequestMethod.POST)
	public String modifyPost(BoardVO vo)throws Exception{
		service.update(vo);
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public String delete(int bno)throws Exception{
		service.delete(bno);
		return "redirect:/board/list";
	}	
}
