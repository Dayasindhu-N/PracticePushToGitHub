package stack_programs;

import java.util.*;

public class StackProgram {

	public static void main(String[] args) {
		Stack<Object> s=new Stack<Object>();
		System.out.println(s.isEmpty());
		s.add(10);
		s.push(20);
		s.push(true);
		s.push("Hello");
		s.push(20);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}