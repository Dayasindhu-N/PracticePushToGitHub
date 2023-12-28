package Array_Program;

public class Pattern10 {
//	1*3
//	2*4
//	3*5
//	4*6
	public static void main(String[] args) {
		int row=4;
		int col=7;
		for (int i = 1; i <=row; i++) {
			int n=i;
			for (int j = 1; j <=col; j++) {
				if (j%2==1) {
					System.out.print(n+" ");
					n+=2;
				}else {
					System.out.print('*'+" ");
				}
			}
			System.out.println();
		}
	}
}
//public class Pattern10 {
//	public static void main(String[] args) {
////		int row=4;
////		int col=3;
//		for (int row = 1; row <=4; row++) {
//			int n=row;
//			for (int col = 1; col <=5; col++) {
//				if (col==2 || col==4) {
//					System.out.print('*'+" ");
//				}
//				else {
//					System.out.print(n+" ");
//					n+=2;
//				}
//			}
//			System.out.println();
//		}
//	}
//}
