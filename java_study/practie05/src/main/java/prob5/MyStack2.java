package prob5;

import java.util.Arrays;

public class MyStack2 {
	private Object[] stack;
	private int index=-1;
	
	public MyStack2(int i) {
		stack=new Object[i];
	}
	public boolean isMax() {
		return index!=stack.length-1;
	}
	public void push(Object string) {
		if(isMax()) {
			stack = Arrays.copyOf(stack, stack.length + 1);
		}
		stack[++index] = string;
	}
	public boolean isEmpty() {
		return index==-1;
	}
	public Object pop() {
		return isEmpty()?error():stack[index--];
	}
	
	public String error() {
		throw new MyStackException();
	}
}