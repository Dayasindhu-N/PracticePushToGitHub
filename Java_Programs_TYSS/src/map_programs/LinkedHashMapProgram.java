package map_programs;

import java.util.LinkedHashMap;

public class LinkedHashMapProgram {
	public static void main(String[] args) {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		LinkedHashMap<Comparable, Comparable> l=new LinkedHashMap();
		l.put(20.36, "Jenny");
		l.put("Daya", 5);
		l.put(true, "Yash");
		System.out.println(l);
	}
}