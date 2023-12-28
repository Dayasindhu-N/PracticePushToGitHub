package object_class_programs;

public class Emp2 {
	String ename;
	int eid;
	double sal;
	public Emp2(String ename, int eid, double sal) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}
	public static void main(String[] args) {
		Emp2 e1=new Emp2("Asit", 5, 6302225);
		Emp2 e2=new Emp2("Santhosh", 2, 6302225);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		Emp2 e3=e2;
		System.out.println(e2.equals(e3));
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
}
