package hashset_programs;

import java.util.HashSet;
import java.util.Iterator;

public class P1 {
	public static void main(String[] args) {
		HashSet<Object> h=new HashSet<Object>();
		h.add(10);
		h.add("the");
		h.add(20.56);
		h.add(true);
		h.add("String");
		h.add(20.56);
		h.add(63);
		System.out.println(h);
		Iterator<Object> i=h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}