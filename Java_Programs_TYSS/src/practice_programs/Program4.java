package practice_programs;

class Program4{
//	public static void main(String[] args){
//		int[] arr={1,1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0};
//		int count=0;
//		int min=arr.length-1;
//		for(int i=0;i<arr.length;i++){
//			if (arr[i]==1) {
//				count=1;
//				for (int j = i+1; j < arr.length; j++) {
//					if (arr[i]==arr[j]) {
//						count++;
//					} else {
//						break;
//					}
//				}
//			}
//			else {
//				break;
//			}
//		}
//		System.out.println("Minimum consecutive ones:"+min);
//	}
	public static void main(String[] args){
		int[] arr={1,1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0};
		int count=0;
		int max=0;
		for(int i=0;i<arr.length;i++){
			if (arr[i]==1) {
				count++;
			}else {
				if (max<count) {
					max=count;
				}
				count=0;
			}
		}
		System.out.println("Minimum consecutive ones:"+max);
	}
}