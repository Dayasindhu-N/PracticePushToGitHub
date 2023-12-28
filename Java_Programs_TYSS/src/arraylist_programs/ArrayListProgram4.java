package arraylist_programs;

import java.util.ArrayList;

public class ArrayListProgram4 {

	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<>();
		a1.add(10);
		a1.add(20.8);
		a1.add(30.6);
		System.out.println((Integer)a1.get(0)+(Double)a1.get(1)+(Double)a1.get(2));
	}
}