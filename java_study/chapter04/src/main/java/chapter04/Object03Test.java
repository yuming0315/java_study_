package chapter04;

public class Object03Test {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//객체의 값의대한 equals가 String 객체 내부에 정의되어있는 듯
		System.out.println(s1.hashCode() + ":"+ s2.hashCode());
		System.out.println(System.identityHashCode(s1)+" "+System.identityHashCode(s2));

		System.out.println("=======================================================");
		
		String s3 ="hello";
		String s4 ="hello"; //s1과 해시값이 다름
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));//객체의 값의대한 equals가 String 객체 내부에 정의되어있는 듯
		System.out.println(s3.hashCode() + ":"+ s4.hashCode());
		System.out.println(System.identityHashCode(s3)+" "+System.identityHashCode(s4));

		System.out.println("=======================================================");
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));//객체의 값의대한 equals가 String 객체 내부에 정의되어있는 듯
		System.out.println(s1.hashCode() + ":"+ s4.hashCode());
		System.out.println(System.identityHashCode(s1)+" "+System.identityHashCode(s4));
		
	}

}
