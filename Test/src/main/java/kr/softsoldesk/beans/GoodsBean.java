package kr.softsoldesk.beans;

public class GoodsBean {
	
	private int goods_idx; //기본키
	
	private String goods_name;
	private String goods_price;
	private String goods_store;
	
	public int getGoods_idx() {
		return goods_idx;
	}
	public void setGoods_idx(int goods_idx) {
		this.goods_idx = goods_idx;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}
	public String getGoods_store() {
		return goods_store;
	}
	public void setGoods_store(String goods_store) {
		this.goods_store = goods_store;
	}
	
}//class
