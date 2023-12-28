package blocks;

public class ConstructorAndBlock2 {
	static {
		System.out.println("SIB-1");
	}
	static {
		System.out.println("SIB-2");
	}
	public ConstructorAndBlock2() {
		System.out.println("Constructor-1");
	}
	{
		System.out.println("IIB-1");
	}
	{
		System.out.println("IIB-2");
	}
	public ConstructorAndBlock2(int a) {
		System.out.println("Constructor-2");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorAndBlock2 b1=new ConstructorAndBlock2();
		System.out.println("Main Method");
		ConstructorAndBlock2 b2=new ConstructorAndBlock2(20);
	}
}