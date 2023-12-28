package arrayOfObject_programs;

public class Emp {
	String ename;
	int eid;
	double sal;
	
	public Emp(String ename,int eid,double sal) {
		this.ename=ename;
		this.eid=eid;
		this.sal=sal;
	}
	
	public String toString() {
		return "Ename: "+this.ename+" "+"Eid: "+this.eid+" "+"Salary: "+this.sal;
	}

	public static void main(String[] args) {
		Emp e1=new Emp("Asit", 1, 56232.33);
		Emp e2=new Emp("Rajesh", 2, 33655.25);
		Emp e3=new Emp("Udit", 3, 144254.87);
		Emp arr[]=new Emp[3];
		arr[0]=e1;
		arr[1]=e2;
		arr[2]=e3;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
