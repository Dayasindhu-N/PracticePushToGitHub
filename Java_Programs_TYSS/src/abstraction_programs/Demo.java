package abstraction_programs;

public abstract class Demo {
	void method(){
		System.out.println("Method-1");
	}
	public static void method1() {
		System.out.println("Method-2");
	}
	public abstract void method2();
	public abstract void method3();
	public static void main(String[] args) {
		System.out.println("Main Method");
	}
}