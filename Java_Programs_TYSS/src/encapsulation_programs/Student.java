package encapsulation_programs;

public class Student {
	public static void main(String[] args) {
		College c1=new College("Asit", 25, 5, 2, "ME");
		College c2=new College("Ashwin", 28, 6, 8, "AE");
		College c3=new College("Bharath", 66, 2, 0, "CSE");
		College c4=new College("Nish", 162, 8, 3, "EEE");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
