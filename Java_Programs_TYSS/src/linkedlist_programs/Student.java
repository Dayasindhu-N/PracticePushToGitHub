package linkedlist_programs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

@SuppressWarnings("rawtypes")
public class Student implements Comparable {
	String sname;
	int sid;
	double per;
	int Class;
	
	public Student(String sname,int sid,double per,int Class) {
		this.sname=sname;
		this.sid=sid;
		this.per=per;
		this.Class=Class;
	}
	public String toString() {
		return "Student name:"+this.sname+" Student ID:"+this.sid+" Percentage:"+this.per+" Class:"+this.Class;
	}
	public int compareTo(Object o) {
		Student s=(Student)o;
		if (this.per==s.per) {
			return 0;
		}else if (this.per>s.per) {
			return 1;
		}else {
			return -1;
		}
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList<Student> data=new LinkedList<Student>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the details:");
		System.out.println("Enter the Student name:");
		String sname=s.nextLine();
		System.out.println("Enter the Student enrolment ID:");
		int sid=s.nextInt();
		System.out.println("Enter the percentage:");
		double per=s.nextDouble();
		System.out.println("Enter the class:");
		int Class=s.nextInt();
		data.add(new Student(sname, sid, per, Class));
		boolean flag=true;
		do {
			System.out.println("Press Y to enter the details or any character to exit:");
			char ch=s.next().charAt(0);
			if (ch=='Y' || ch=='y') {
				s.nextLine();
				System.out.println("Enter the Student name:");
				sname=s.nextLine();
				System.out.println("Enter the Student enrolment ID:");
				sid=s.nextInt();
				System.out.println("Enter the percentage:");
				per=s.nextDouble();
				System.out.println("Enter the class:");
				Class=s.nextInt();
				data.add(new Student(sname, sid, per, Class));
			} else {
				flag =false;
			}
		} while (flag);
		System.out.println("Before Sorting");
		System.out.println(data);
		System.out.println("After sorting");
		Collections.sort(data);
		for (Student std : data) {
			System.out.println(std);
		}
		s.close();
	}
}