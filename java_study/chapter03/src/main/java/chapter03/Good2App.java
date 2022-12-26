package chapter03;

import mypackage.Goods2;

public class Good2App{

	public static void main(String[] args) {
		Goods2 g = new Goods2();
		
		g.name="camera";	//public 접근제한없음.
		//g.price=10000;		//protected는 같은 패키지에서 접근이 가능하다.
		//g.countStock=10;	//디폴트는 같은 패키지에서 접근이 가능하다.
		//g.countSold=50;		//private는 같은 클래스에서만 접근이 가능해서 오류
		

	}

}
