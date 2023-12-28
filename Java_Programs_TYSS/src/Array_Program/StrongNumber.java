package Array_Program;

import java.util.Scanner;

public class StrongNumber {
	
	public static int isfactorial(int a) {
		int prod=1;
		for (int i = 1; i <=a; i++) {
			prod*=i;
		}
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while (temp!=0) {
			int rem=temp%10;
			sum+=isfactorial(rem);
			temp/=10;
		}
		if (sum==n) {
			System.out.println("It is a strong number");
		} else {
			System.out.println("It is not a strong number");
		}
		sc.close();
	}
}