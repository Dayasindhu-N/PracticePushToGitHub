package arrayOfObject_programs;

import java.util.Scanner;

public class Student2 {
	String sname;
	int regdNo;
	String branch;
	
	

	public Student2(String sname, int regdNo, String branch) {
		super();
		this.sname = sname;
		this.regdNo = regdNo;
		this.branch = branch;
	}
	
	
	@Override
	public String toString() {
		return "Student Name:"+this.sname+"  Regd No:"+this.regdNo+"  Branch:"+this.branch;
	}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		Student2 arr[]=new Student2[size];
		System.out.println("Enter the details");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Student name");
			s.nextLine();
			String sname=s.nextLine();
			System.out.println("Enter the RegNo");
			int regNo=s.nextInt();
			System.out.println("Enter the branch");
			s.nextLine();
			String branch=s.nextLine();
			arr[i]=new Student2(sname, regNo, branch);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		s.close();
	}
}
