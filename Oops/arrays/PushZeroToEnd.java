package arrays;

public class PushZeroToEnd {
	public static void pushZeroToEnd(int[] arr) {
		int nonZero = 0;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp= arr[i];
				arr[i]=arr[nonZero];
				arr[nonZero]=temp;
				nonZero++;
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	
	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,0,4,1,3,0,28,0,0,0,23,0,15,11};
		pushZeroToEnd(arr);
		
	}

}
