package Array_Program;

public class SumOfNumbersInString {
	public static void main(String[] args) {
		String s1="ELF44AND45JAVASELENIUM2023";
		String s2="0";
		int sum=0;
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='0' && ch[i]<='9') {
				s2+=ch[i];
			}else {
				sum+=Integer.parseInt(s2);
				s2="0";
			}
		}
		sum+=Integer.parseInt(s2);
		System.out.println(sum);
	}
}