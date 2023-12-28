package blocks;

public class StaticBlock {
	static {
		System.out.println("From SIB-1");
	}
	static {
		System.out.println("From SIB-2");
	}
	static {
		System.out.println("From SIB-3");
	}
	public static void main(String[] args) {
		System.out.println("From Main method");
	}
	static {
		System.out.println("From SIB-4");
	}
	static {
		System.out.println("From SIB-5");
	}
}
