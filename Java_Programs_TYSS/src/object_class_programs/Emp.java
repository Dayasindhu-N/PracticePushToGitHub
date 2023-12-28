package object_class_programs;

public class Emp {
	String ename;
	int eid;
	double sal;
	public Emp(String ename, int eid, double sal) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", eid=" + eid + ", sal=" + sal + "]";
	}
	
	public boolean equals(Object o) {
		Emp e=(Emp)o;
		if (e.sal==this.sal) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Emp e1=new Emp("Asit", 5, 6302225);
		Emp e2=new Emp("Santhosh", 2, 6302225);
		System.out.println(e1.equals(e2));
	}
}
