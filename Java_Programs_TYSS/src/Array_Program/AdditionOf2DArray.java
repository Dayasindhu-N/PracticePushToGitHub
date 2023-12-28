package Array_Program;

import java.util.Scanner;

public class AdditionOf2DArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns of an array");
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		int arr1[][]=new int[size1][size2];
		System.out.println("Enter the elements of an array-1");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("2d Array-1 is:");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		int arr2[][]=new int[size1][size2];
		System.out.println("Enter the elements of an array-2");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("2d Array-2 is:");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		int sum[][]=new int[size1][size2];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Addition of 2D arrays:");
		for (int k = 0; k < sum.length; k++) {
			for (int l = 0; l < sum[k].length; l++) {
				System.out.print(sum[k][l]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}