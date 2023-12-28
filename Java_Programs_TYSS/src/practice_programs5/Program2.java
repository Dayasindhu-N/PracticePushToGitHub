package practice_programs5;

public class Program2 {
	
	public static String removeDuplicates(String s1) {
		String s2="";
		String s3=s1;
		char arr[]=s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			s2="";
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]!=arr[j]) {
					continue;
				}
				s2+=arr[i];
			}
			s3=s3.replace(s2, "");
		}
		return s3;
	}
	public static void main(String[] args) {
		String s1="ramvarmaram";
		System.out.println(removeDuplicates(s1));
	}
}