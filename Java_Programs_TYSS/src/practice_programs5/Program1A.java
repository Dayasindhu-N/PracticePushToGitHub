package practice_programs5;

public class Program1A {

	public static void main(String[] args) {
		int n=6;
		for (int i = 1; i <=n; i++) {
			int num=1;
			char c='A';
			for (int j = 1; j <=n; j++) {
				if (i==j) {
					System.out.print("@"+" ");
				}else if (i>j) {
					System.out.print(num+" ");
					num++;
				}else {
					System.out.print(c+" ");
					c++;
				}
			}
			System.out.println();
		}
	}
}