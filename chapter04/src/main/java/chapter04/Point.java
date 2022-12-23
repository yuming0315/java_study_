package chapter04;

public class Point {
	private int x,y;

	public Point() {
		
	}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("x: %d, y: %d",x,y);
	}
	
	public boolean equals(Point p) {
		if(this.x==p.x && this.y==p.y) return true;
		return false;
	}
}
