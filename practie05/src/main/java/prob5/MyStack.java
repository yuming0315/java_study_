package prob5;

import java.util.Arrays;

public class MyStack {
	private String[] stack;
	private int index=-1;
	
	public MyStack(int i) {
		stack=new String[i];
	}
	public void push(String string) {
		if(index==stack.length-1) {
			stack = Arrays.copyOf(stack, stack.length + 1);
		}
		stack[++index] = string;
	}
	public boolean isEmpty() {
		return (index==-1?true:false);
	}
	public String pop() {
		if(index==-1) {
			throw new MyStackException();
		}
		return stack[index--];
	}
	
	
}