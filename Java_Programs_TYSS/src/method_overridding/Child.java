package method_overridding;

class Parent{
	void light() {
		System.out.println("Halogen lights");
	}
}

public class Child extends Parent {
	
	void light() {
		System.out.println("LED Lights");
	}

	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.light();
		Child c1=new Child();
		c1.light();
		p1=c1; //up-casting
		p1.light(); //overridding happening
	}
}