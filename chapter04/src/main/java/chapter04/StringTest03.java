package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		//String s1 = "Hello "+"World"+" Java "+ 17;
		String s1 = new StringBuffer("Hello ")
		.append("World")
		.append(" Java")
		.append(17)
		.toString();
		//append는 자기자신을 리턴
		
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<1000000;i++) {
			sb.append(i);
		} //재할당 없이 자기자신을 계속 늘리는 것 재할당하고 자원반환하고를 반복하면 자바가비지컬렉터가 일을 많이해야하고 느려짐 반복적+금지
		String s3 = sb.toString();
		
		System.out.println(s1);
	}

}
