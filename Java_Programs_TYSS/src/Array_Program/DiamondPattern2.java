package Array_Program;

public class DiamondPattern2 {

	public static void main(String[] args) {
		int row=7;
		int space=3;
		int stars=1;
		int n=1;
		char c='A';
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <=stars; k++) {
				if (i%2==1) {
					System.out.print(n+" ");
					n++;
				}else {
					System.out.print(c+" ");
					c++;
				}
			}
			if (i<=3) {
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
