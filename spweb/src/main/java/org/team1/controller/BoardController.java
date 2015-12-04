package org.team1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.team1.domain.BoardVO;
import org.team1.domain.Criteria;
import org.team1.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService service;
	

	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
//	@RequestMapping(value="/list", method = RequestMethod.GET)
//	public void listAll(@RequestParam(value="page",required=false) Integer page,Model model)throws Exception{
//		logger.info("list........");
//		
//		logger.info("재현이형 사랑합니다");
//		Criteria cri = new Criteria();
//		PageMaker pagemaker = new PageMaker(page, service.searchCount(cri));
//		System.out.println(pagemaker.toString());
//		model.addAttribute("list",service.listpage(pagemaker.getPage()));
//		model.addAttribute("pagemaker",pagemaker);
////		model.addAttribute("list", service.listAll());
//		
////		return "/board/list";
//	}
	
	@RequestMapping(value="/view", method = RequestMethod.GET)
	public void view(int bno,@ModelAttribute("cri")Criteria cri,Model model)throws Exception{
	
	System.out.println(bno);
	service.hit(bno);	
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
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public void searchlist(@ModelAttribute("cri") Criteria cri,Model model) throws Exception{
		cri.setTotalCount(service.searchCount(cri));
		logger.info("=============");
		logger.info(cri.toString());
		logger.info("=============");
		model.addAttribute("list",service.search(cri));
	}
}
