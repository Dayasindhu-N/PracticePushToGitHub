package map_programs;

import java.util.TreeMap;

public class TreeMapProgram {
	public static void main(String[] args) {
		TreeMap<Integer, String> t=new TreeMap<Integer, String>();
		t.put(9, "Rock");
		t.put(7, "John");
		t.put(1, "Daya");
		t.put(5, "Nish");
		t.put(3, "Zein");
		t.put(4, "Tom");
		System.out.println(t);
	}
}