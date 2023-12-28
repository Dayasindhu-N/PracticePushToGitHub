package interface_programs;

interface I2{
	void m1();
	void m2();
}
public class p2 implements I2 {
	public void m1() {
		System.out.println("M-1");
	}
	public void m2() {
		System.out.println("M-2");
	}
	public static void main(String[] args) {
		I2 i=new p2();
		i.m1();
		i.m2();
	}
}
