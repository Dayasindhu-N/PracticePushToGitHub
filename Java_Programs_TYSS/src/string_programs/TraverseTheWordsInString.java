package string_programs;

public class TraverseTheWordsInString{
	public static void main(String[] args){
	String s1="Hi Welcome to TestYantra";
	String s2="";
	String arr[]=s1.split(" ");
	for (int i = 0; i < arr.length; i++) {
		for (int j = arr[i].length()-1; j>=0; j--) {
			s2+=arr[i].charAt(j);
		}
		s2+=" ";
	}
	System.out.println(s2);
}
}