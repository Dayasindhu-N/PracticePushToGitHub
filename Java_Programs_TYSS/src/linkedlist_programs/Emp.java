package linkedlist_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Emp implements Comparable<Object> {
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
	public int compareTo(Object o) {
		Emp e=(Emp)o;
		if (this.sal==e.sal) {
			return 0;
		}else if (this.sal>e.sal) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
	@Override
	public String toString() {
		return "Employee name=" + ename + ", eid=" + eid + ", sal=" + sal;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		Emp data[]=new Emp[size];
		System.out.println("Enter the details");
		for (int i = 0; i < data.length; i++) {
			s.nextLine();
			System.out.println("Enter the name:");
			String ename=s.nextLine();
			System.out.println("Enter the employee ID:");
			int eid=s.nextInt();
			System.out.println("Enter the salary:");
			double sal=s.nextDouble();
			data[i]=new Emp(ename, eid, sal);
		}
		Arrays.sort(data);
		System.out.println("After sorting:");
		for (Emp e : data) {
			System.out.println(e);
		}
		s.close();
	}
}