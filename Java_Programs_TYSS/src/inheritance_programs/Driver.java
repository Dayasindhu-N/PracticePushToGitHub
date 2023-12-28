package inheritance_programs;

public class Driver {

	public static void main(String[] args) {
		SubClass s1=new SubClass();
		s1.a=20;
		s1.b=6.03;
		s1.f=6.77f;
		s1.c='N';
		System.out.println(s1.a+" "+s1.b+" "+s1.f+" "+s1.c);
		SuperClass s2= new SuperClass();
		s2.a=98;
		s2.b=5.36;
		System.out.println(s2.a+" "+s2.b);
	}

}
