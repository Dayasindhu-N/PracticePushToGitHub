package inheritance_programs;

public class TE extends Emp {

	public static void main(String[] args) {
		TE t1=new TE();
		System.out.println(t1.ename);
		System.out.println(t1.eid);
		System.out.println(t1.bloodGroup);
		System.out.println(t1.phNo);
		t1.ename="Nish";
		System.out.println(t1.ename);
		t1.eid=7;
		System.out.println(t1.eid);
	}

}
