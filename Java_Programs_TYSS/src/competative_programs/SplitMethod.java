package competative_programs;

import java.util.Scanner;

public class SplitMethod {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
        String s = "He is a very very good boy, isn't he?";
        s=s.replace(",", "");
        s=s.replace("'", " ");
        s=s.replace("?", "");
        String[] s1 = s.split(" ");
        System.out.println(s1.length);
        for (int i = 0; i < s1.length; i++) {
        	System.out.println(s1[i]);
		}
        //scan.close();
	}
}