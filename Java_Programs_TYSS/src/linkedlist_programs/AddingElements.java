package linkedlist_programs;

import java.util.LinkedList;

public class AddingElements {
	public static void main(String[] args) {
		LinkedList<Object> l=new LinkedList<Object>();
		l.add(10);
		l.add(20);
		l.add("Hello");
		l.add(true);
		l.add(220);
		l.add(10);
		System.out.println(l);
		l.addFirst(0011);
		System.out.println(l);
		l.addLast(3202);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
	}
}