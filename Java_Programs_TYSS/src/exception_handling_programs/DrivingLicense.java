package exception_handling_programs;

import java.util.Scanner;

@SuppressWarnings("serial")
class DrivingLicenseException extends RuntimeException{
	public DrivingLicenseException(String msg) {
		super(msg);
	}
}
public class DrivingLicense {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if (age>=20) {
			System.out.println("You can apply for DL");
		} else {
			throw new DrivingLicenseException("You cant apply for DL");
		}
		sc.close();
	}
}