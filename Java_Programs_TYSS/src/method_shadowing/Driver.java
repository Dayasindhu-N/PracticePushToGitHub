package method_shadowing;

class Parent{
	public static void method() {
		System.out.println("Method-1");
	}
}

class Child extends Parent{
	public static void method() {
		System.out.println("Method-2");
	}
}

public class Driver {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.method();
		Child c1=new Child();
		c1.method();
		p1=c1;
		p1.method();
	}
}