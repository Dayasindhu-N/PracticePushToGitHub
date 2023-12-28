package recurrsion_programs;

public class RecurrsionPro2 {
	public static void printingTheNumbers(int num) {
		if (num==0) {
			return;
		}
		System.out.print(num+" ");
		printingTheNumbers(num-1);
	}
	public static void main(String[] args) {
		printingTheNumbers(5);
	}
}
