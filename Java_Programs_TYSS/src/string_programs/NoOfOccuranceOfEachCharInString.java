package string_programs;

public class NoOfOccuranceOfEachCharInString {
	public static void main(String[] args) {
		String s1="Happy Deepavali Festival to all of you";
		s1=s1.replace(" ", "");
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=1;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
					ch[j]='%';
				}
			}
			if (count>=1 && (ch[i]>'A' || ch[i]<'Z' || ch[i]>'a' || ch[i]<'z')) {
				System.out.println(ch[i]+"---->"+count);
			}
		}
	}
}