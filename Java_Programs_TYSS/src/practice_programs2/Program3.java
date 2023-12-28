package practice_programs2;

public class Program3 {
	public static void main(String[] args) {
		String s1="AAAAbbbccDDDDDeeeeFFFFgggg";
		String s2="";
		char[] ch=s1.toCharArray();
		for (int i = 0; i <ch.length; i++) {
			if (ch[i]>='A' && ch[i]<='Z') {
				s2+=(char) (ch[i]+32);
			}else if (ch[i]>='a' && ch[i]<='z') {
				s2+=(char) (ch[i]-32);
			}
			else {
				continue;
			}
		}
		System.out.println(s2);
	}
}