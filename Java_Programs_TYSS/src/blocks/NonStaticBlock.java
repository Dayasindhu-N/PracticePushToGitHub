package blocks;

public class NonStaticBlock {
	{
		System.out.println("Non Static Block - 1");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		NonStaticBlock n1=new NonStaticBlock();
		System.out.println("Main Method");
	}
}