package string_programs;

public class Demo2 {
	public static void main(String[] args) {
		String s1=new String("Hello");
		System.out.println(s1);
		System.out.println(s1.concat("All"));
		System.out.println(s1);
		s1=s1.concat("All");
		System.out.println(s1);
	}
}