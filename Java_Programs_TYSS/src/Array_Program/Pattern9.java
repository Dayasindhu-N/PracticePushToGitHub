package Array_Program;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		for (int i = 1; i <=(n/2+1); i++) {
			for (int j = 1; j <=(n/2+1)-i; j++) {
				System.out.print(" "+" ");
			}
			for (int k = 1; k <=2*i-1; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=n/2;i>=1;i--)
		{
			for(int j=i;j<=n/2;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}