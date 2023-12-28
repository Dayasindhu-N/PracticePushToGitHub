package inheritance_programs;

public class Drivers {

	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.a=10;
		p1.b=5.2;
		p1.c=565555287;
		System.out.println(p1.a+" "+p1.b+" "+p1.c);
		Child c1=new Child();
		c1.a=88;
		c1.b=6.23;
		c1.c=6452451;
		System.out.println(c1.a+" "+c1.b+" "+c1.c);
	}

}
