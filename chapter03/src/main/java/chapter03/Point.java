package chapter03;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void show() {
		System.out.printf("점 (x=%d, y=%d)을 그렸습니다.\n",x,y);
	}
	public void show(boolean visible) {
		if(visible) {
			show();
		}
		else {
			System.out.printf("점 (x=%d, y=%d)을 지웠습니다.\n",x,y);
		}
		
	}
}
