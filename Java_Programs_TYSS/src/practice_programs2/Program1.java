package practice_programs2;

public class Program1 {
	
	public static boolean strongNumber(int n) {
		int n1=n;
		int sum=0;
		int prod=1;
		while (n1!=0) {
			int temp=n1%10;
			for (int i = 1; i <=temp; i++) {
				prod*=i;
			}
			sum+=prod;
			n1/=10;
			prod=1;
		}
		if (n==sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		if (strongNumber(45361)==true) {
			System.out.println("It is a strong number");
		} else {
			System.out.println("It is not a strong number");
		}
	}

}
