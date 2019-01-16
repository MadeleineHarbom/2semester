package eksempel1;

import opgave1.Stack;

import java.util.LinkedList;


public class LinkListStack<T> implements Stack<T> {

	LinkedList<T> li = new LinkedList<>();

	@Override
	public void push(T data) {
		li.addFirst(data);
	}

	@Override
	public T pop() {
		if (!li.isEmpty()) {
			return li.removeFirst();
		} else {
			return null;
		}
	}

	public void displayStack() {
		System.out.println(li.toString());
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toStirng() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] arguments) {
		LinkListStack<String> stack = new LinkListStack<>();
		stack.push("Test");
		stack.displayStack();
	}
}
