package recurrsion_programs;

public class RecurrsionPro {
	public static void printingTheNumbers(int num) {
		if (num==0) {
			return;
		}
		printingTheNumbers(num-1);
		System.out.print(num+" ");
	}
	public static void main(String[] args) {
		printingTheNumbers(5);
	}
}
