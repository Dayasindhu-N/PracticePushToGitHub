package linkedhashset_programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class P1 {
	public static void main(String[] args) {
		LinkedHashSet<Object> l=new LinkedHashSet<Object>();
		l.add(10);
		l.add(63);
		l.add(false);
		l.add("Gross");
		l.add(23.65);
		l.add(3571255);
		System.out.println(l);
		Iterator<Object> i=l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}