package prob6;

public class Rectangle extends Shape implements Resizable{

	public Rectangle(double i, double j) {
		setWH(i,j);
	}

	@Override
	public void resize(double s) {
		setWH(getWidth()*s,getHeight()*s);
	}
	
	@Override
	public double getArea() {
		return getWidth()*getHeight();
	}

	@Override
	public double getPerimeter() {
		return (getWidth()+getHeight())*2;
	}

}
