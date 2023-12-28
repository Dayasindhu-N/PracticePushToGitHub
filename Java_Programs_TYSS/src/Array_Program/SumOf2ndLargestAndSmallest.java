package Array_Program;

import java.util.Scanner;

public class SumOf2ndLargestAndSmallest {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int min=arr[1];
		int max=arr[arr.length-2];
		sum+=min+max;
		System.out.println("Sum of "+arr[1]+" and "+arr[arr.length-2]+" is:"+sum);
		sc.close();
	}
}