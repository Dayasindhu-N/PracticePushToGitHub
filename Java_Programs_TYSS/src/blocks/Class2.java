package blocks;

public class Class2 {

	public static void main(String[] args) {
		Class1 c1=new Class1();
		System.out.println(c1.a);
		System.out.println(Class1.b);
		Class1.b=40.4;
		System.out.println(Class1.b);
	}

}
