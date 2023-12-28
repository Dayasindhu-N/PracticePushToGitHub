package practice_programs34;

public class Program4 {
	public static void main(String[] args) {
		int arr[]= {2,5,4,8,1,9,7,3,88,75,98,123,547,889,587};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int secondMaximumNumberInArray=arr[arr.length-2];
		System.out.println("Second Maximum Number In Array: "+secondMaximumNumberInArray);
	}
}