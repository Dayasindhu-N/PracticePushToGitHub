package string_programs;

public class ReplaceMethod {
	public static void main(String[] args) {
		String s1="Harry";
		String s2="aaa bbb  ccc dd eeee fffff";
		s1=s1.replace('r', 'p');
		s2=s2.replace(" ", "");
		System.out.println(s1);
		System.out.println(s2);
//		char arr[]=s2.toCharArray();
//		String s3="";
//		for (int i = 0; i < arr.length; i++) {
//			if (s3.indexOf(arr[i])==-1) {
//				s3+=arr[i];
//			}
//		}
//		System.out.println(s3);
	}
}
