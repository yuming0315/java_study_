package prob5;

public class MyStackException  extends IndexOutOfBoundsException{
	private static final String message = "stack is empty";

	public MyStackException() {
		super(message);
	}
	public MyStackException(String s) { 
        super(message);     
    }
}
