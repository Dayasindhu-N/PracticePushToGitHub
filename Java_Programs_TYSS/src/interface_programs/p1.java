package interface_programs;

public interface p1 {
	void m1();
	static void m2() {
		System.out.println("Method-1");
	}
	int a=10;
	public static void main(String[] args) {
		System.out.println(a);
	}
}