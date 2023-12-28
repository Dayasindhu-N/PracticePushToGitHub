package object_class_programs;

public class Student {
	String sname;
	int sid;
	int std;
	public Student(String sname, int sid, int std) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.std = std;
	}
	public String toString() {
		return "Student Name= " + sname + ","+" Student ID=" + sid + ","+" Standard=" + std ;
	}
	public static void main(String[] args) {
		Student s1=new Student("Asit", 5, 2);
		System.out.println(s1);
		Student s2=new Student("Janau", 23, 1);
		System.out.println(s2);
		Student s3=new Student("Kanaj", 96, 8);
		System.out.println(s3);
	}
}
