package Array_Program;

import java.util.Scanner;

public class ContainsMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2="";
		String arr[]=s1.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (s2.contains(arr[i])==false) {
				s2+=arr[i]+" ";
			}
		}
		System.out.println(s2);
		sc.close();
	}
}
