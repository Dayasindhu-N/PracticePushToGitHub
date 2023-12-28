package Array_Program;

public class NoOfOccurance {
	public static void main(String[] args) {
		String s1="KARNATAKA";
		int count=0;
		char arr[]=s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]=='A') {
				count+=1;
			}
		}
		System.out.println(count);
	}
}
