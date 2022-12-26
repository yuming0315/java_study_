package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a=10;
		int b=10-a;

		System.out.println("Some Code1...");
		try {
			System.out.println("Some Code2...");
			System.out.println("Some Code3...");
			int result = (1+2+3) / b;	
			System.out.println("Some Code4...");
			System.out.println("Some Code5...");
		}catch(ArithmeticException ex) {
			//ex.printStackTrace();
			/* 예외처리 */
			//1.로깅
			System.out.println("error:"+ex);
			//2.사과
			System.out.println("sorry.");
			//3.정상종료
			return;
//			System.exit(0);
			//리턴 시 자바가 알아서 처리
			//0이 아닌것들은 에러코드 보내는거 0번은 에러가 없다 에러코드 안내보냄
		}finally {
			//보통 자원정리 file close 같은 것
			System.out.println("Some Code7...");			
		}

		
	}

}