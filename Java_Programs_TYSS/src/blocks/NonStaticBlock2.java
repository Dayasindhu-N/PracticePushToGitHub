package blocks;

@SuppressWarnings("unused")
public class NonStaticBlock2 {
	int a=10;
	{
		int a=20;
		a=30;
		System.out.println(this.a);
	}
	{
		a=40;
	}
	public static void main(String[] args) {
		NonStaticBlock2 n1=new NonStaticBlock2();
		System.out.println(n1.a);
	}
}