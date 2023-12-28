package object_class_programs;

import java.util.Objects;

public class Emp3 {
	String ename;
	int eid;
	double sal;
	public Emp3(String ename, int eid, double sal) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(eid,sal);
	}

	@Override
	public boolean equals(Object o) {
		Emp3 e=(Emp3)o;
		if (e.sal==this.sal && e.eid==this.eid) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Emp3 e1=new Emp3("Asit", 5, 6302225);
		Emp3 e2=new Emp3("Santhosh", 5, 6302225);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		Emp3 e3=e2;
		System.out.println(e2.equals(e3));
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
}
