package kr.softsoldesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.softsoldesk.beans.MemberBean;
import kr.softsoldesk.service.MemberService;

@Controller
public class MemeberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/main")
	private String main(@ModelAttribute("memberBean") MemberBean memberBean) {
		return "main";
	}
	
	@PostMapping("/member/join")
	private String member_join(@ModelAttribute("memberBean") MemberBean memberBean) {
		
		memberService.addMember(memberBean);
		return "success";
	}
	
}//class
