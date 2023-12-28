package Array_Program;

public class SeparationOfString {
	public static void main(String[] args) {
		String s1="28September2023@#";
		String s2="";
		String s3="";
		String s4="";
		char arr[]=s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>='A' && arr[i]<='Z' || arr[i]>='a' && arr[i]<='z') {
				s2+=arr[i];
			}
			else if (arr[i]>='0' && arr[i]<='9') {
				s3+=arr[i];
			}
			else {
				s4+=arr[i];
			}
		}
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}