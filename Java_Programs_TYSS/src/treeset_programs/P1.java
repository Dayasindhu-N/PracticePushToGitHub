package treeset_programs;

import java.util.Iterator;
import java.util.TreeSet;

public class P1 {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(10);
		t.add(20);
		t.add(37);
		t.add(5);
		t.add(2);
		System.out.println(t);
		System.out.println("Printing in the ascending order");
		Iterator<Integer> i1=t.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("Printing in the descending order");
		Iterator<Integer> i=t.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}