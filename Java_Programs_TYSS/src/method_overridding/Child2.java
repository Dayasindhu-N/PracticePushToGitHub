package method_overridding;

class Parent1{
	void method() {
		System.out.println("Method-1");
	}
}

class Child1 extends Parent1 {
	
	void method() {
		System.out.println("Method-2");
	}
}

public class Child2 extends Child1{
	
	void method() {
		System.out.println("Method-3");
	}
	
	public static void main(String[] args) {
		Parent1 p1=new Parent1();
		p1.method(); //method-1
		Child1 c1=new Child1();
		c1.method(); //method-2
		p1=c1; //up-casting
		p1.method(); //overridding happening //method-2
		Parent1 p3=new Child2(); //up-casting
		p3.method(); //method-3
	}
}