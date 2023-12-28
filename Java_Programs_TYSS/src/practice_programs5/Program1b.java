package practice_programs5;

public class Program1b {
	public static void main(String[] args) {
		int row=5;
		char c='A';
		int space=4;
		int num=1;
		for (int i = 1; i <=row; i++) {
			c='A';
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				if (i%2!=0) {
					System.out.print(num+" ");
					num++;
				} else {
					System.out.print(c+" ");
					c++;
				}
			}
			space--;
			System.out.println();
		}
	}
}