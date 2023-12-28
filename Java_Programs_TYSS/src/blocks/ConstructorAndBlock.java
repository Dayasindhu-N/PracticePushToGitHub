package blocks;

public class ConstructorAndBlock {
	public ConstructorAndBlock() {
		System.out.println("Constructor");
	}
	{
		System.out.println("IIB");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorAndBlock b1=new ConstructorAndBlock();
	}
}