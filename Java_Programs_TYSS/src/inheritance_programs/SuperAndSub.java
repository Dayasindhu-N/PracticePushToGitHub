package inheritance_programs;

public class SuperAndSub {

	public static void main(String[] args) {
		Sub s1=new Sub();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s1.c);
		System.out.println(s1.d);
		Super s2=s1;
		System.out.println(s2.a);
		System.out.println(s2.b);
//		System.out.println(s2.c);
//		System.out.println(s2.d);
		Sub s3=(Sub) s2;
		System.out.println(s3.c);
		System.out.println(s3.d);
	}
}