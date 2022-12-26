package chapter03;

public class SwapTest3 {

	public static void main(String[] args) {
		Value a = new Value(10);
		Value b = new Value(20);
		System.out.println("a:" + a.val + ", b:" + b.val);
		swap(a,b);
		System.out.println("a:" + a.val + ", b:" + b.val);
		//System.out.println(temp);
	}
	public static void swap(Value m,Value n) {
		int temp = m.val;
		m.val = n.val;
		n.val = temp;
	}
}
