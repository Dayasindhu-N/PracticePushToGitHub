package vector_programs;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorMethod {
	public static void main(String[] args) {
		Vector<Object> v1=new Vector<Object>();
		v1.add(10);
		v1.add(56);
		v1.addElement("Hello");
		v1.add(true);
		v1.add(30);
		System.out.println(v1);
		for (Object o : v1) {
			System.out.println(o);
		}
		System.out.println("=================");
		ListIterator<Object> i=v1.listIterator(v1.size());
		while (i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}
}