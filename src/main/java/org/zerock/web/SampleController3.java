package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.MemberVO;

@Controller
public class SampleController3 {
	
	
	private final static Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	
	@RequestMapping("/doJSON")
	public @ResponseBody MemberVO doJSON(){
		
		MemberVO vo = new MemberVO();
        vo.setUserid("jisub");
        vo.setUpw("jisub");
        vo.setUname("111");
        vo.setEmail("111@naver.com");
        vo.setPhone("011-777-3943");
        vo.setGender("f");
		
        return vo;
	}
	
}
