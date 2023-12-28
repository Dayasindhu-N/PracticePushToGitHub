package Array_Program;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
		int count=0;
		int temp=n1;
		while (temp!=0) {
			count++;
			temp/=10;
		}
		int sum=0;
		int temp1=n1;
		while (temp1!=0) {
			int rem=temp1%10;
			int pow=1;
			for (int i = 1; i <= count; i++) {
				pow=rem*pow;
			}
			sum+=pow;
			temp1/=10;
		}
		if (sum==n1) {
			System.out.println(n1+" is a Amstrong number");
		}
		else {
			System.out.println(n1+" is not a Amstrong number");
		}
		sc.close();
	}

}
