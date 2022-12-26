package prob6;

public abstract class Shape {
	private double width;
	private double height;
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public void setWH(double w,double h) {
		setWidth(w);
		setHeight(h);
	}
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
