package string_programs;

public class SumOfDigitsInString {
	public static void main(String[] args) {
		String s1="2November2023";
		int sum=0;
		char s2[]=s1.toCharArray();
		for (int i = 0; i < s2.length; i++) {
			if (s2[i]>='0' && s2[i]<='9') {
				sum+=Integer.parseInt(s2[i]+"");
			}
		}
		System.out.println(sum);
	}
}