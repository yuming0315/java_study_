package chapter03;

import mypackage.Goods2;

public class DiscountGoods2 extends Goods2 {
	private float discountrate = 0.5f;	//double이 아니고 float라는 표시 f
	
	public float getDiscountPrice() {
		//protected는 자식에서 접근 가능
		return discountrate*price;
	}
}
