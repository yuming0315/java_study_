package com.douzone.paint.main;

import com.douzone.paint.i.Drawable;
import com.douzone.paint.point.ColorPoint;
import com.douzone.paint.point.Point;
import com.douzone.paint.shape.Circle;
import com.douzone.paint.shape.Rect;
import com.douzone.paint.shape.Shape;
import com.douzone.paint.shape.Triangle;
import com.douzone.paint.text.GraphicText;

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
		draw(new GraphicText("Hello World"));
		
		//instanceof 연산자 Test
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		//아래문장은 컴파일 조차 안시켜줌 instanceof가 가능한 관계는 상속받은 위의가족들
		//System.out.println(circle instanceof Rect);
		
		//오류: 연산자 우측항이 클래스인 경우,
		//레퍼런스 하고 있는 class 타입의 hierachy 상의 하위와 상위만
		//instanceof 연산자를 사용할 수 있다.
		
		Object o = circle;
		System.out.println(o instanceof String);
		
		//연산자 우측항이 인터페이스인 경우,
		//Hierachy 상관 없이 instanceof 연산자를 사용할 수 있다.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
		
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
