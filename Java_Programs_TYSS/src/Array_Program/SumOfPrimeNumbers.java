package Array_Program;

public class SumOfPrimeNumbers {
	
	public static boolean isPrime(int n) {
		if (n==1) {
			return false;
		}
		for (int i = 2; i <=n/2; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num=50;
		int sum=0;
		for (int i = 1; i <=num; i++) {
			if (isPrime(i)==true) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println();
		System.out.println(sum);
	}
}