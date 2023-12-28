package arraylist_programs;

import java.util.ArrayList;

public class ArrayListProgram6 {

	public static void main(String[] args) {

		ArrayList<Object> a1=new ArrayList<>();
		a1.add("pritam");
		a1.add("true");
		a1.add("hello");
		for (int i = 0; i <a1.size(); i++) {
			a1.set(i, ((String) a1.get(i)).substring(0,1).toUpperCase()+((String) a1.get(i)).substring(1));
		}
		System.out.println(a1);
	}
}