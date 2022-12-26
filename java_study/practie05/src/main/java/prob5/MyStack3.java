package prob5;

import java.util.Arrays;

public class MyStack3<T> {
	private T[] stack;
	private int index=-1;
	
	@SuppressWarnings("unchecked") //2
	public MyStack3(int i) {
		stack = (T[])new Object[i]; //1
	}
	public boolean isMax() {
		return index!=stack.length-1;
	}
	public void push(T t) {
		if(isMax()) {
			stack = Arrays.copyOf(stack, stack.length + 1);
		}
		stack[++index] = t;
	}
	public boolean isEmpty() {
		return index==-1;
	}
	public T pop() {
		return isEmpty()?(T) error():stack[index--];
	}
	
	public Object error() {
		throw new MyStackException();
	}
}