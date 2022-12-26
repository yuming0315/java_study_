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
	
	/*equals 연산 예시*/
	//1. 동일성일시 true 리턴
	//2. null값이면 false 리턴
	//3. getClass()가 다르면 다른객체니까 내용비교 안해도 되니까 false리턴
	//4. Point other = (Point)obj;
	//	 return x == other.x && y == other.y
	
	//큰단위부터 비교해서 리턴을 해버리게해서 연산속도 올리기
	
	public boolean equals(Point p) {
		if(this.x==p.x && this.y==p.y) return true;
		return false;
	}
}
