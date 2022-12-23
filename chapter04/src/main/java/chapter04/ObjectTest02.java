package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p4 = new Point(100,200);
		Point p3 = p2;
		
		//p1을 했을 때 String 값이 출력되는데, String 값이랑 비교하는지 아니면 객체의 해시값을 비교한 후 내용물 비교?주소비교?인지
		System.out.println(p1==p2);
		System.out.println("해시값: "+p1.hashCode()+", 겟클레스: "+p1.getClass());
		System.out.println("해시값: "+p2.hashCode()+", 겟클레스: "+p2.getClass());
		System.out.println("해시값: "+p3.hashCode()+", 겟클레스: "+p3.getClass());
		System.out.println(p2==p3);

		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p4.equals(p3));
	}

}
