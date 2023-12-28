package arraylist_programs;

import java.util.ArrayList;

public class ArrayListProgram7 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(1);
		a1.add(20);
		System.out.println(a1);
		
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(69);
		a2.add(54);
		System.out.println(a2);
		System.out.println(a2.addAll(a1));
		System.out.println(a2);
		System.out.println(a2.containsAll(a1));
		System.out.println(a1.containsAll(a2));
	}
}