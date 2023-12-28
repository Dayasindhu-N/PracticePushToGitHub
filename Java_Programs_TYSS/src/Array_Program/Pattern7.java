package Array_Program;

public class Pattern7 {
	public static void main(String[] args) {
		int n=5;
		char c='A';
		int a=1;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if (i==j) {
					System.out.print('@'+" ");
				} else if(i<j) {
					System.out.print(c+" ");
					c++;
				}
				else {
					System.out.print(a+" ");
					a++;
				}
			}
			System.out.println();
		}
	}
}
