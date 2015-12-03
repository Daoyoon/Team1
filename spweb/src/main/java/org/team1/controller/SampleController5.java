package org.team1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team1.domain.MemberVO;

@Controller
public class SampleController5 {


	
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
