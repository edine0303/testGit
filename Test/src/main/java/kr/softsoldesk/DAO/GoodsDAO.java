package kr.softsoldesk.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.softsoldesk.beans.GoodsBean;
import kr.softsoldesk.mapper.GoodsMapper;

@Repository
public class GoodsDAO {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	//상품등록
	public void addGoods(GoodsBean goodsBean) {
		goodsMapper.addGoods(goodsBean);
	}
	
}//class
