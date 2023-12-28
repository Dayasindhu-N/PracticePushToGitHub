package practice_programs;

public class Program3 {
	public static void main(String[] args) {
		reverseOrder(24);
	}
	public static void reverseOrder(int n) {
		if (n<14) {
			return;
		}
		System.out.print(n+" ");
		reverseOrder(n-1);
		return;
	}
}