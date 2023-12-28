package Array_Program;

import java.util.Scanner;

public class TransposeArray {
	
	public static int[][] transpose(int b[][]) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (i>j) {
					int temp=b[i][j];
					b[i][j]=b[j][i];
					b[j][i]=temp;
				}
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns of an array");
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		int arr[][]=new int[size1][size2];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("2d Array is:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int res[][]=transpose(arr);
		System.out.println("Transpose Array:");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}