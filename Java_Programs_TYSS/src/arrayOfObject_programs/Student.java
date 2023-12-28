package arrayOfObject_programs;

public class Student {
	String sname;
	int rollNo;
	int Class;
	
	

	public Student(String sname, int rollNo, int Class) {
		super();
		this.sname = sname;
		this.rollNo = rollNo;
		this.Class = Class;
	}
	
	
	@Override
	public String toString() {
		return "Student Name:"+this.sname+"  Roll No:"+this.rollNo+"  Class:"+this.Class;
	}


	public static void main(String[] args) {
		Student arr[]= {new Student("Asit",5,2),new Student("Ajit", 3, 6),new Student("Raja", 9, 6)};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
