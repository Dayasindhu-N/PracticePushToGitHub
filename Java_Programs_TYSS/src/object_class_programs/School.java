package object_class_programs;

public class School {
	String sname;
	double per;
	int rollno;
	int std;
	
	public School(String sname, double per, int rollno, int std) {
		super();
		this.sname = sname;
		this.per = per;
		this.rollno = rollno;
		this.std = std;
	}
	
	
	@Override
	public String toString() {
		return "School [Student Name=" + sname + ", Percentage=" + per + ", Roll No=" + rollno + ", Class=" + std + "]";
	}
	
	public boolean equals(Object o) {
		School s=(School)o;
		if (s.per==this.per && s.sname.equals(this.sname)) {
			return true;
		} else {
			return false;		}
	}
	public static void main(String[] args) {
		School s1=new School("Ajith", 93.36, 6, 7);
		School s2=new School("Ajith", 93.36, 8, 8);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		School s3=new School("Sita", 93.36, 9, 7);
		System.out.println(s3);
		System.out.println(s2.equals(s3));
	}
}