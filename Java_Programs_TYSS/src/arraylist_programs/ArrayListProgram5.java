package arraylist_programs;

import java.util.ArrayList;

public class ArrayListProgram5 {

	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<>();
		a1.add(10);
		a1.add(true);
		a1.add("Hello");
		a1.add(20.8);
		a1.add(30.6);
		System.out.println(a1.contains(true));
		System.out.println(a1.contains("Hello"));
		System.out.println(a1.contains(21));
	}
}