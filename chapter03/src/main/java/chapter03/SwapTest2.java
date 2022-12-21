package chapter03;

public class SwapTest2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a:" + a + ", b:" + b);
		swap(a,b);
		System.out.println("a:" + a + ", b:" + b);
		//System.out.println(temp);
	}
	public static void swap(int m,int n) {
		int temp = m;
		m = n;
		n = temp;
	}
}
