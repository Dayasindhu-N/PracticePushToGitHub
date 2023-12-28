package map_programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {
	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(7, "Asit");
		h.put(5, "Ajit");
		h.put(3, "Vineet");
		h.put(1, "Avi");
		h.put(6, "Seen");
		System.out.println(h);
		Set<Integer> keysData=h.keySet();
		for (Integer data : keysData) {
			System.out.println(data);
		}
		Collection<String> valuesData=h.values();
		for (String data : valuesData) {
			System.out.println(data);
		}
		for(Entry<Integer,String> data:h.entrySet()) {
			System.out.println(data.getKey()+" "+data.getValue());
		}
	}
}