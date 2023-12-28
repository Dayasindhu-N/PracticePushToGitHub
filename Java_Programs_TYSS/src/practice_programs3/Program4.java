package practice_programs3;

public class Program4 {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7,8};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i+1; j < arr2.length; j++) {
				if (arr2[i]<arr2[j]) {
					int temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		int count=arr1.length+arr2.length;
		int[] arr=new int[count];
		for (int i = 0; i < arr1.length; i++) {
			arr[i]=arr1[i];
		}
		for (int i = 0; i <arr2.length; i++) {
			arr[arr1.length+i]=arr2[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}