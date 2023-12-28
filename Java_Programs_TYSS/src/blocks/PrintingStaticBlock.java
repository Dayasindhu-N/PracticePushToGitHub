package blocks;

public class PrintingStaticBlock {
	static int a=10;
	static {
		@SuppressWarnings("unused")
		int a=20;
		a=30;
	}
	public static void main(String[] args) {
		System.out.println(a);
	}
}