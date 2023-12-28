package practice_programs3;

class Student{
	private int sid=2;
	private String sname;
	private int standard;
	private char section;
	private double per;
	
	public Student(int sid,String sname,int standard,char section,double per) {
		this.sid=sid;
		this.sname=sname;
		this.standard=standard;
		this.section=section;
		this.per=per;
	}
	
	public String toString() {
		return "Student name:"+this.sname+", Student ID:"+this.sid+", Standard:"+this.standard+", Section:"+this.section+", Percentage:"+this.per;
	}
	
	public int getSid() {
		return this.sid;
	}
	
	public String getSname() {
		return this.sname;
	}
	
	public int getStandard() {
		return this.standard;
	}
	
	public char getSection() {
		return this.section;
	}
	
	public String play(int num) {
		if (this.sid==num) {
			return "Percentage:"+this.per+", Section ID:"+this.sid;
		}else {
			return "Invalid Student ID";
		}
	}
	
}
public class Program2 {
	public static void main(String[] args) {
		Student s1=new Student(2, "Asit", 7, 'A', 75.63);
		System.out.println(s1);
		Student s2=new Student(7, "Abhi", 5, 'B', 79.36);
		System.out.println(s2);
		s2.play(7);
	}
}