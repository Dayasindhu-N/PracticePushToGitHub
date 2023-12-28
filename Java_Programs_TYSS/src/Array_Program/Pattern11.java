package Array_Program;

public class Pattern11 {
	public static void main(String[] args) {
		for (int row = 1; row<=3; row++) {
			for (int col = 1; col <=3; col++) {
				int n=row+col;
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}
}
