package exception;
import java.io.IOException;

public class MyClass {
	public void danger() throws IOException{
		System.out.println("some code....");
		
		throw new IOException();
	}
}
