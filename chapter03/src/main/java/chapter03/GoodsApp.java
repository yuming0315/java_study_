package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		camera.printInfo();
		
		Goods camera1 = new Goods();
		Goods camera2 = new Goods();
		Goods camera3 = new Goods();
		Goods camera4 = new Goods();
		
		camera.printInfo();
	}

}
