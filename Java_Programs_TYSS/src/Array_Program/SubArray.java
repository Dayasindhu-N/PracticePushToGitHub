package Array_Program;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		//int arr[]= {1,2,3,4};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sub array's are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <=j; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}