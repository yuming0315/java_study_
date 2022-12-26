package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Object point = new Point();
		
		
		System.out.println(point);
		System.out.println(point.hashCode()); //toString 정의안할 시 @(at)뒤의 나오는 값이 이거임 주소값은 아님
		
		Class klass = point.getClass();
		System.out.println(klass.toString());

		int[] a = new int[5];
		System.out.println(a.hashCode());
	}

}
