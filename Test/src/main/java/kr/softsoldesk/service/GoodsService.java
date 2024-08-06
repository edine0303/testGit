package kr.softsoldesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.softsoldesk.DAO.GoodsDAO;
import kr.softsoldesk.beans.GoodsBean;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsDAO goodsDAO;
	
	//상품등록
	public void addGoods(GoodsBean goodsBean) {
		goodsDAO.addGoods(goodsBean);
	}
	
}//class
