package chapter03;

abstract class car{
	int a=10;
	abstract void move();
}

class bus extends car{
	void move() {
		System.out.println("move");
	}
	public void move2() {
		System.out.println("move2");
	}
}

public class Test {

	public static void main(String[] args) {
		car c = new bus();
		c.move();
		System.out.println(c.a);
		
	}

}
