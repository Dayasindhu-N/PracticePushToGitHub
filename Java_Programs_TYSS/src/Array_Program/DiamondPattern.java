package Array_Program;

public class DiamondPattern {

	public static void main(String[] args) {
		int row=5;
		int space=2;
		int stars=1;
		for (int i = 0; i <row; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < stars; k++) {
				System.out.print("* ");
			}
			if (i<2) {
				space--;
				stars+=2;
			} else {
				space++;
				stars-=2;
			}
			System.out.println();
		}
	}

}
