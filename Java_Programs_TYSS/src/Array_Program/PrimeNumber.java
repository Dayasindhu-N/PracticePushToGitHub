package Array_Program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		boolean flag=true;
		if(num==0 || num==1) {
			flag=false;
		}
		for (int i = 2; i <=num/2; i++) {
			if (num%i==0) {
				flag=false;
				break;
			}
		}
		if (flag==true) {
			System.out.println("It is a Prime Number");
		} else {
			System.out.println("It is not a Prime number");
		}
		sc.close();
	}
}