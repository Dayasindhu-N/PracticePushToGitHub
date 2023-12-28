package exception_handling_programs;

import java.util.Scanner;

@SuppressWarnings("serial")
class UnderAgeException extends RuntimeException{
	public UnderAgeException(String msg) {
		super(msg);
	}
}

public class Driver {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if (age>18) {
			System.out.println("You can vote");
		} else {
			throw new UnderAgeException("You cannot vote");
		}
		sc.close();
	}
}
