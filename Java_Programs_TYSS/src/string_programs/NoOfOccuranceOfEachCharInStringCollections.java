package string_programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class NoOfOccuranceOfEachCharInStringCollections {
	public static void main(String[] args) {
		String s1="Happy Deepavali Festival to all of you";
		s1=s1.replace(" ", "");
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		char ch[]=s1.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			count=0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			h.put(ch[i], count);
		}
		String s2="";
		for(Entry<Character, Integer> data:h.entrySet()) {
			if (data.getValue()>1) {
				s2+=data.getKey()+" ";
			}
		}
		System.out.println("Duplicates are:"+s2);
	}
}