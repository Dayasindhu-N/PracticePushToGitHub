package Array_Program;

import java.util.Scanner;

public class TechMahindra2 {

	public static void main (String[]args)
	   {
		Scanner sc=new Scanner(System.in);
		System.out.println("Lower:");
	     int lower = sc.nextInt();
	     System.out.println("Upper:");
	     int upper = sc.nextInt();
	     int count=0;
	     for(int i=lower;i<=upper;i++) {
	    	 
	    	 if(isPrime(i)==true) {
	    		 count++;
	    	 }
	     }
	     int arr[]=new int[count];
	     int k=0;
	     for(int i=lower;i<=upper;i++) {
	    	 if(isPrime(i)==true) {
	    		arr[k++]=i; 
	    	 }
	     }
	     System.out.println(arr[0]);
	     System.out.println(arr[arr.length-1]);
	     System.out.println(arr[0]+arr[arr.length-1]);
	     sc.close();
	   }
	public static boolean isPrime(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
}
