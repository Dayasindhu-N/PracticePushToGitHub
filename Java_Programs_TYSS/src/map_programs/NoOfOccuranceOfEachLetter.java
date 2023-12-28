package map_programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class NoOfOccuranceOfEachLetter {
	public static void main(String[] args) {
		String s1="Dayasindhu";
		s1=s1.toLowerCase();
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		int count=0;
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count=0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			h.put(ch[i], count);
		}
		System.out.println(h);
		for(Entry<Character, Integer> data:h.entrySet()) {
			if (data.getValue()>1) {
				System.out.println(data.getKey());
			}
		}
	}
}