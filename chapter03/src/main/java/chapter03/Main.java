package chapter03;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(10);
		point1.setY(10);
		
		drawPoint(point1);
		point1.show(false);
		
		Point point2 = new ColorPoint(1,2,"red");
		point2.setX(20); //부모의 메소드 호출가능 필드 x y도 애초에 부모것
//		drawColorPoint(point2);
		
		Rect rect = new Rect();
		drawShape(rect);
		
		Triangle tri = new Triangle();
		drawShape(tri);
		
		Circle circle = new Circle();
		drawShape(circle);
		
		draw(point1);
		draw(point2);
		draw(rect);
		draw(tri);
		draw(circle);
		
		
	}
	public static void draw(Drawable d) {
		d.draw();
	}
	public static void drawPoint(Point point) {
		point.show();
	}
//	public static void drawColorPoint(ColorPoint point) {
//		point.show();
//	}
	public static void draw(Rect rect) {
		rect.draw();
	}
	public static void drawTriangle(Triangle tri) {
		tri.draw();
	}
	public static void drawShape(Shape s) {
		s.draw();
	}
}
