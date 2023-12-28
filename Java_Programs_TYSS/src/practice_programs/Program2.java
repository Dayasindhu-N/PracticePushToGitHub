package practice_programs;

import java.util.TreeSet;

public class Program2 {
	public static void main(String[] args) {
		String s1="SADF23HKJ56DR32LOI89WQ472NBM2V1BHU78";
		String s2="0";
		TreeSet<Integer> t=new TreeSet<Integer>();
		char[] c=s1.toCharArray();
		for (int i = 0; i <c.length; i++) {
			if (c[i]>='0' && c[i]<='9') {
				s2+=c[i];
			}else {
				t.add(Integer.parseInt(s2));
				t.remove(0);
				s2="0";
			}
		}
		System.out.println(t);
	}
}