package inheritance_programs;

public class P1AndP2 {

	public static void main(String[] args) {
		P2 c1=new P2();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(c1 instanceof P1);
		System.out.println(c1 instanceof P2);
		P1 c2=new P1();
		System.out.println(c2.a);
		System.out.println(c2.b);
//		System.out.println(c2.c);
//		System.out.println(c2.d);
		System.out.println(c2 instanceof P1);
		System.out.println(c2 instanceof P2);
		c2=c1; //UPCASTING
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c2 instanceof P2);
//		System.out.println(c2.c);
//		System.out.println(c2.d);
		P2 c3=(P2) c2; //DOWNCASTING
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c3.c);
		System.out.println(c3.d);
	}

}
