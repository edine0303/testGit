package kr.softsoldesk.mapper;

import org.apache.ibatis.annotations.Insert;

import kr.softsoldesk.beans.GoodsBean;

public interface GoodsMapper {
	
	//상품등록
	@Insert("insert into goods_table values(goods_seq.nextval, #{goods_name}, #{goods_price}, #{goods_store})")
	void addGoods(GoodsBean goodsBean);
	
	//상품호출
	
	
}//interface
