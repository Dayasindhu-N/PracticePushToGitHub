package practice_programs;

public class Program1 {
	public static void main(String[] args) {
		int[] arr= {234,654,876,789,927,713,643};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int n1=arr[i]/10;
				int temp1=n1%10;
				int l1=arr[j]/10;
				int temp2=l1%10;
				if (temp1>temp2) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}