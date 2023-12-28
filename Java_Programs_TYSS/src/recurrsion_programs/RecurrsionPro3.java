package recurrsion_programs;

public class RecurrsionPro3 {
	public static void printingTheNumbers(int num) {
		if (num==0) {
			return;
		}
		System.out.print(num+" ");
		printingTheNumbers(num-1);
		System.out.print(num+" ");
		return;
	}

	public static void main(String[] args) {
		printingTheNumbers(5);
	}
}