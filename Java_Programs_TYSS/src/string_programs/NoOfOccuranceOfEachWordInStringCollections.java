package string_programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class NoOfOccuranceOfEachWordInStringCollections {
	public static void main(String[] args) {
		String s1="Hello Hye Hi Hello How Hye Hi are you Hello";
		String arr[]=s1.split(" ");
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			count=0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			h.put(arr[i], count);
		}
		System.out.println(h);
		System.out.println("Duplicates are:");
		@SuppressWarnings("unused")
		String s2="";
		for(Entry<String, Integer> data:h.entrySet()) {
			if (data.getValue()>1) {
				s2+=data.getKey()+" ";
				System.out.println(data.getKey()+" "+data.getValue());
			}
		}
	}
}