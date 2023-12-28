package practice_programs34;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		//String s1="Sky is beautiful";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String arr[]=s1.split(" ");
		int count=arr.length;
		System.out.println(count);
		sc.close();
	}
}
