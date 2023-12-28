package Array_Program;

public class CapitalOfEveryWord {
	public static void main(String[] args) {
		String s1="				i live in bengaluru";
		String s2="				";
		String arr[]=s1.split(" ");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			s2+=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ";
		}
		s2=s2.trim();
		System.out.println(s2);
	}
}
