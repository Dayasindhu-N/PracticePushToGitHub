package package1;

public class Class5 {
	private int a=10;
	private static double b=5.32;
	void method() {
		System.out.println("Method-1");
	}
	public static void main(String[] args) {
		Class5 c1=new Class5();
		c1.a=20;
		System.out.println(c1.a);
		System.out.println(Class5.b);
	}
}
