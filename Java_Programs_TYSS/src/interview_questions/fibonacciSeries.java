package interview_questions;

import java.util.Scanner;

public class fibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		System.out.print(a+" "+b+" ");
		for (int i = 3; i <=num; i++) {
			sum+=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			sum=0;
		}
		sc.close();
	}
}