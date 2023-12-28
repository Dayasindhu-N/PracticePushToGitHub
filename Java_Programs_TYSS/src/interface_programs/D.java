package interface_programs;

interface A{
	void m1();
}

interface B extends A{
	void m2();
}

interface C extends A{
	void m3();
}

public class D implements B,C{
	public void m1() {
		System.out.println("Method-1");
	}
	public void m2() {
		System.out.println("Method-2");
	}
	public void m3() {
		System.out.println("Method-3");
	}
	public static void main(String[] args) {
		A a1=new D();
		a1.m1();
//		a1.m2(); CTE
//		a1.m3(); CTE
		B b1=new D();
		b1.m1();
		b1.m2();
		//b1.m3(); CTE
		C c1=new D();
		c1.m1();
		//c1.m2(); CTE
		c1.m3();
	}
}
