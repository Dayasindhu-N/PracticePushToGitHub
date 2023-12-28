package Array_Program;

public class SplitMethod {
	public static void main(String[] args) {
		String s1="Your flaws will attract others";
		String arr[]=s1.split(" ");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

//public class SplitMethod {
//	public static void main(String[] args) {
//		String s1="Your flaws will attract others";
//		String arr[]=s1.split(" ");
//		System.out.println(arr.length);
//		String rev="";
//		for (int i =arr.length-1; i>=0; i--) {
//			rev+=arr[i]+" ";
//		}
//		System.out.println(rev);
//	}
//}