package Array_Program;

public class Pattern12 {
	public static void main(String[] args) {
		char ch='A';
		for (int row = 1; row<=3; row++) {
			for (int col = 1; col <=3; col++) {
				if (row==col) {
					System.out.print(ch+" ");
					ch++;
				} else {
					System.out.print((row+col)+" ");
				}
			}
			System.out.println();
		}
	}
}
