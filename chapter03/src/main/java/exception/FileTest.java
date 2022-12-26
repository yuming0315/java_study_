package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt");
			int data = fis.read();
			if(fis==null) {
				new MyClass().danger();
			}
			throw new MyException();
			//System.out.println((char)data);
		} catch (FileNotFoundException e) {
			System.out.println("error:"+e);
		}catch(IOException e) {
			System.out.println("error:"+e);
		}catch(MyException e){
			System.out.println(e);
		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
