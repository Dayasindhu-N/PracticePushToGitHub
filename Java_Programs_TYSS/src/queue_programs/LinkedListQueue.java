package queue_programs;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQueue {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(true);
		l.add("Hello");
		l.add(63.25);
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.peek());
		Iterator i=l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}