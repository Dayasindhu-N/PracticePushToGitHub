package practice_programs5;

import java.util.HashMap;
import java.util.Iterator;

public class Program3 {
	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(560085, "Kathreguppe");
		h.put(571418, "Mandya");
		h.put(571448, "B.G.Nagara");
		System.out.println(h);
		Iterator<?> i=h.entrySet().iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}	
	}
}