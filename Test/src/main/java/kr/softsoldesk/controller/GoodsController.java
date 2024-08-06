package kr.softsoldesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import kr.softsoldesk.beans.GoodsBean;
import kr.softsoldesk.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	@GetMapping("/goods")
	private String goods(@ModelAttribute("sellBean") GoodsBean goodsBean) {
		return "goods";
	}
	
	@GetMapping("/goods/sell")
	private String goods_sell(@ModelAttribute("sellBean") GoodsBean goodsBean) {
		
		goodsService.addGoods(goodsBean);
		return "success";
	}
	
}//class
