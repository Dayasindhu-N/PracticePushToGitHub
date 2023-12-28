package practice_programs3;

public class Program3 {
	String ename;
	int empid;
	double sal;
	
	public Program3() {
		System.out.println("First pass elements to display the details idiot");
	}
	
	public Program3(int empid, double sal) {
		this.empid=empid;
		this.sal=sal;
		System.out.println("Employee ID=" + this.empid + ", Salary=" + this.sal);
	}
	public Program3(String ename,int empid,double sal) {
		this.ename=ename;
		this.empid=empid;
		this.sal=sal;
		System.out.println("Employee name=" + this.ename + ", Employee ID=" + this.empid + ", Salary=" + this.sal);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Program3 p1=new Program3();
		Program3 p2=new Program3(7, 85258.32);
		Program3 p3=new Program3("Daya", 3, 95985.23);
	}
}