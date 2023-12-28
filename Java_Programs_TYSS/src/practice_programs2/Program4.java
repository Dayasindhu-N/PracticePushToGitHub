package practice_programs2;

public class Program4 {
	static boolean flag=true;
	public static void isPrime(int num) {
		if(num==0 || num==1) {
			flag=false;
		}
		for (int i = 2; i <=num/2; i++) {
			if (num%i==0) {
				flag=false;
				break;
			}else {
				flag=true;
			}
		}
	}
	public static void main(String[] args) {
		int sum=0;
		int n1=5;
		int n2=35;
		for (int i=n1; i <=n2; i++) {
			isPrime(i);
			if (flag==true) {
				sum+=i;
			}
		}
		System.out.println("Sum is:"+sum);
	}
}