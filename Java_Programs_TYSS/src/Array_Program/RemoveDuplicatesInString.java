package Array_Program;

import java.util.Scanner;

public class RemoveDuplicatesInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.nextLine();
		String s2="";
		char arr[]=s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (s2.indexOf(arr[i])==-1) {
				s2+=arr[i];
			}
		}
		System.out.println(s2);
		sc.close();
	}
}
