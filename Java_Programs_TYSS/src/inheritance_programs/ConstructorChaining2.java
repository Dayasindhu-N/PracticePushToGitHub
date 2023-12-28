package inheritance_programs;

public class ConstructorChaining2 extends ConstructorChaining1 {
	public ConstructorChaining2() {
		System.out.println("Constructor-2");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorChaining2 c1=new ConstructorChaining2();
	}
}