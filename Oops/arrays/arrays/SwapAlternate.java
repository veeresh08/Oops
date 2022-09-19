package arrays;

public class SwapAlternate {
	public static void printSwapAlternate(int[] arr) {
		int[] res = new int[arr.length];
		
		for(int i =0;i<arr.length-1;i+=2) {
			int temp = arr[i];
			res[i]=arr[i+1];
			res[i+1] = temp;
		
		
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(res[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,1,9,3,10,15};
		printSwapAlternate(arr);
	}

}
