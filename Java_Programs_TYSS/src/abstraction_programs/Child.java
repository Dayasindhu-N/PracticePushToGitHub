package abstraction_programs;

public class Child extends Parent {
	public void method1() {
		System.out.println("Method-2");
	}
	public static void main(String[] args) {
		Child c1=new Child();
		c1.method1();
		Parent p1=c1; //Up-Casting
		p1.method1();
	}
}