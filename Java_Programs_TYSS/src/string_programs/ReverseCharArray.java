package string_programs;

public class ReverseCharArray {
	public static void main(String[] args) {
		String s1="Dayasindhu";
		char arr[]=s1.toCharArray();
		for (int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
}
