package inheritance_programs;

class Parent1{
	int a;
}

class Child1 extends Parent1{
	int b;
}

class Child2 extends Child1{
	int c;
}

public class Driver1 {

	public static void main(String[] args) {
		Child2 c1=new Child2();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		Child1 c2=c1; //Upcasting
		Child2 c3=(Child2) c2; //Downcasting
		System.out.println(c3.c);
		Parent1 p1=new Child2(); //Upcasting
		Child2 c4=(Child2) p1; //Downcasting
		System.out.println(c4.b);
		System.out.println(c4.c);
	}
}
