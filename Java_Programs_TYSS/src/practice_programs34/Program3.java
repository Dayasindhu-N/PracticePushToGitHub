package practice_programs34;

public class Program3 {
	public static void main(String[] args) {
		String s1="Basavanagudi";
		char s2='i';
		char[] c=s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (s2==c[i]) {
				System.out.println("Index of "+c[i]+": "+i);
			}
		}
	}
}