package chapter04;

public class WrapperClasstest02 {

	public static void main(String[] args) {
		String s = "123456";
		int i = Integer.parseInt(s);
		
		//cf1 반대로
		String s1 = String.valueOf(i);
		//cf2 ㅂㄴ대로
		String s2 = "" + i;
		
		System.out.println(s+":"+s1+":"+s2);
		
		int a = Character.getNumericValue('J');
		//0~9 a~z(A-Z) 대소문자 구분x 0~35
		System.out.println(a);
		
		a = Character.getNumericValue('z');
		System.out.println(a);
		
		String s4 = Integer.toBinaryString(0xF);
		System.out.println(s4);
		
		String s5 = Integer.toHexString(20);//10진수를 16진수로
		System.out.println(s5);
	}

}
