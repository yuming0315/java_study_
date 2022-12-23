package chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		//불변성
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase(); //String으로 리턴 함 => 새로운 객체를 만듬? s1값 안바뀌니까 그런듯
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println(equalsHello("Hello"));
	}

	private static boolean equalsHello(String str) {
		return "Hello".equals(str); // str.equals("Hello") 는 null이 들어오면 오류 뜸
	}
}
