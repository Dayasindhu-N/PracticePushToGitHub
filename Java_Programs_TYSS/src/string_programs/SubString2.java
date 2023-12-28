package string_programs;

public class SubString2 {
	public static void main(String[] args) {
		String s1="maharashtra";
		System.out.println(s1.substring(0,4));
		System.out.println(s1.substring(2,s1.length()));
		System.out.println(s1.substring(0,s1.length()-2));
		System.out.println(s1.substring(0, 1).toUpperCase()+s1.substring(1));
	}
}