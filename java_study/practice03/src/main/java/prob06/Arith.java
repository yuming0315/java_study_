package prob06;

public abstract class Arith {
	private int a,b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public abstract int calculate();
}
