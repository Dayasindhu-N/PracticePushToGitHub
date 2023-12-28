package string_programs;

public class StartsWithAndEndsWithMethod {
	public static void main(String[] args) {
		String s1="Harry";
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.startsWith("Ha"));
		System.out.println(s1.startsWith("ha"));
		System.out.println(s1.endsWith("y"));
		System.out.println(s1.endsWith("ry"));
	}
}
