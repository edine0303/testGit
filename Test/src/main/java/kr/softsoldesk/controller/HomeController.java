package kr.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET) //최초에 요청을 하는 시점에서 loginUserBean 생성
	public String home() {
		
		return "redirect:/main"; //최초의 요청을 main에 대한 요청으로 새롭게 바꿈
	}
	
}//class
