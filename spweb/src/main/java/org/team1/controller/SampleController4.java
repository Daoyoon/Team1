package org.team1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr){
	logger.info("doE is running... move to doF");
	rttr.addFlashAttribute("msg", "SUCCESS");
	return "redirect:/doF";
	}
	
	@RequestMapping("doF")
	public void doF(){
		logger.info("doF is running....");
	}
}
