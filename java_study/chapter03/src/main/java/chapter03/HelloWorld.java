package chapter03;

public class HelloWorld {

	public static void main(String[] args) {
		int i=10;
		int j = i;
		j++;
		System.out.println(i+" "+j);
		
		int[] a = {1,2,3,4,5};
		int[] b = a;
		b[0]=100;
		
		System.out.println(a[0]);
		System.out.println(b[0]);

		
		String a1="a1";
		String a2 = a1;
		System.out.println(a1==a2);
		a2+="1234";
		System.out.println(a1);
		System.out.println(a2);
	}

}
