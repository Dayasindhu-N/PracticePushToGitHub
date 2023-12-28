package Array_Program;

public class Pattern13 {
	public static void main(String[] args) {
		char ch='A';
		for (int row = 1; row<=4; row++) {
			for (int col = 1; col <=4; col++) {
				if (row==col) {
					System.out.print(" "+ch+" ");
					ch+=4;
				} else {
					System.out.print((row+col)*row+" ");
				}
			}
			System.out.println();
		}
	}
}
