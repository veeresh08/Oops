package arrays;

public class PremetivewithFunctions {
	public static void increment(int i) {
		i++;
	}
	
	public static void printArray(int arr[]) {
//		System.out.println(input);
		
		  for(int i = 0 ; i<arr.length;i++) {
	    	  System.out.println(arr[i]);
	      }
	}
	
	
	public static int[] incrementArray(int[] input) {
		input = new int[7];
		for(int i = 0; i<input.length;i++) {
			input[i] = input[i]+1;
		}
		return input;
	}
	
	
	
	public static void main(String[] args) {
//		int i = 10;
//		increment(i);
//		System.out.println(i);
		int[] arr = {1,2,3,4,5};
//		System.out.println(arr);
		arr = incrementArray(arr);
		printArray(arr);
		
	}
	
}
