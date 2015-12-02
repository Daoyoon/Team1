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
        vo.setUserid("doyoon");
        vo.setUpw("user90");
        vo.setUname("dodo");
        vo.setEmail("wowo@naver.com");
        vo.setPhone("010-777-3943");
        vo.setGender("f");
		
        return vo;
	}
	
}
