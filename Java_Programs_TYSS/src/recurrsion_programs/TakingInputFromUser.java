package recurrsion_programs;

import java.util.Scanner;

public class TakingInputFromUser {
	public static void printingTheNumber(int a,int b) {
		if (a>b) {
			return;
		}
		printingTheNumber(a, b-1);
		System.out.print(b+" ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower range");
		int n1=sc.nextInt();
		System.out.println("Enter the upper range");
		int n2=sc.nextInt();
		printingTheNumber(n1,n2);
		sc.close();
	}
}