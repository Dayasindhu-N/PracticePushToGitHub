package Array_Program;

import java.util.Scanner;

public class TechMahindra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter starting range:");
		int n1=sc.nextInt();
		System.out.println("Enter ending range:");
		int n2=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>=n1 && arr[i]<=n2) {
				System.out.println(arr[i]+" ");
			}
		}
		sc.close();
	}

}
