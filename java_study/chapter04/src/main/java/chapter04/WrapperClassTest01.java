package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		//
		Integer j1 = 10;
		Integer j2 = 10;
		
		System.out.println(j1==j2);
		System.out.println(j2.equals(j1));
		System.out.println(j1.getClass().getName()); //클래스만 가능
		System.out.println(j2.intValue());
		System.out.println(); //instanceof
		
	}

}
