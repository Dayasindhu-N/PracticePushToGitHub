package Array_Program;

import java.util.Scanner;

public class RemoveDuplicates {
	public static int[] sorting(int z[]) {
		for (int i = 0; i < z.length; i++) {
			for (int j = i+1; j < z.length; j++) {
				if (z[i]>z[j]) {
					int temp=z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
		}
		return z;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int result[]=sorting(arr);
		System.out.println("The sorted array:");
		for (int i = 0; i < result.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int count=0;
		for(int i=0;i<result.length-1;i++) {
			if(result[i]==result[i+1]) {
				count++;
			}
		}
	
		System.out.println("Count:"+count);
		int arr2[]=new int[result.length-count];
		int k=0;
		for (int i = 0; i < result.length-1; i++) {
			if (result[i]!=result[i+1]) {
				arr2[k]=result[i];
				k++;
			}
		}
		arr2[k]=result[result.length-1];
		System.out.println("After removal of duplicates present in array:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		int a=0;
		int b=arr2.length-1;
		while (a<b) {
			int temp=arr2[a];
			arr2[a]=arr2[b];
			arr2[b]=temp;
			a++;
			b--;
		}
		System.out.println("Reverse of a duplicated array");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		sc.close();
	}
}
