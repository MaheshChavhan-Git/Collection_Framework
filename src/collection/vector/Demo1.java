package collection.vector;

import java.util.Stack;

public class Demo1 {
	public static void main(String args[]) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.add("M");
		stack.push("B");
		stack.push("S");
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search("M"));
		
	}
}
