package arraylist_programs;

import java.util.ArrayList;

public class ArrayListProgram3 {

	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(1);
		a1.add(20);
		System.out.println(a1.size());
		System.out.println(a1);
		a1.add(1, 100);
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
		System.out.println(a1.indexOf(100));
		System.out.println(a1.lastIndexOf(20));
		a1.add("Hye");
		System.out.println(a1);
		a1.set(5, "Hello");
		System.out.println(a1);
		for (Object o : a1) {
			System.out.println(o);
		}
	}
}