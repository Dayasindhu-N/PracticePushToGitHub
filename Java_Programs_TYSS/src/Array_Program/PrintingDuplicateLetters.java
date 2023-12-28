package Array_Program;

public class PrintingDuplicateLetters {

	public static void main(String[] args) {
		String s1="Happy Deepavali Festival to all of you";
		String s2="";
		int count=0;
		s1=s1.replace(" ", "");
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count=0;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			if (s2.indexOf(ch[i])==-1 && count>=1) {
				s2+=ch[i]+" ";
				System.out.println(ch[i]+"---->"+count);
			}
		}
		System.out.println(s2);
	}
}