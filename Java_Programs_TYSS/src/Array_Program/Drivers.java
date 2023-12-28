package Array_Program;

import java.util.Scanner;

class MovieTicket{
	
}

class SecondClass extends MovieTicket{
	int p1=100;
	public void method() {
		System.out.println("Second Class: "+p1);
	}
}

class FirstClass extends MovieTicket{
	int p2=200;
	public void method() {
		System.out.println("First Class: "+p2);
	}
}

class Balcony extends MovieTicket{
	int p3=300;
	public void method() {
		System.out.println("Balcony: "+p3);
	}
}
public class Drivers {
	public static void main(String[] args) {
		MovieTicket mt=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to Ticket Booking");
		System.out.println("Select the Category:");
		int n=s.nextInt();
		switch (n) {
		case 1: mt=new SecondClass();
			SecondClass s1=(SecondClass) mt;
			s1.method();
			break;
		
		case 2: mt=new FirstClass();
		FirstClass s2=(FirstClass) mt;
		s2.method();
		break;
		
		case 3: mt=new Balcony();
		Balcony s3=(Balcony) mt;
		s3.method();
		break;
		
		default:System.out.println("Invalid choice");
			break;
		}
		s.close();
	}
}
