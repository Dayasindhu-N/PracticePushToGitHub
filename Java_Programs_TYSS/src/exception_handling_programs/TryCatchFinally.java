package exception_handling_programs;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[arr.length]);
		} catch (Exception e) {
			System.out.println("Exception is handled");
		}finally {
			System.out.println("This is finally block");
		}
	}
}