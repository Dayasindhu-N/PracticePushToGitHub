package blocks;

public class PrintingSIB2 {
	static int a=10;
	static {
		int a=20;
		PrintingSIB2.a=a;
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println(a);
	}

}
