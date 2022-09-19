package arrays;

public class arrayRotate {
	
	public static void rotateArray(int[] arr, int t) {
		
//		creating new array and copying the array to arr2
		int len = arr.length;
		int[] arr2 = new int[len];
		for(int i =0;i<arr.length;i++) {
			arr2[i] =arr[i];
		}
		
//		copy array element starting from t 
		int count=t;
		for(int i = 0;i<arr.length-1;i++) {
			arr[i]= arr[count];
			if(count<arr.length-1) {
				count++;
			}
		}
		
//		printing last element 
		for(int j = 0;j<=len-1;j++) {
			arr[len-t] =arr2[j];
			System.out.println("arr 2 values" +arr2[j]);
			if(!(t>0)) {
				t++;
				
				
			}
		}
		printArr(arr,arr2);
	}

	
//	printing my rotated array
	public static void printArr(int[] arr, int[] arr2) {
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
//	driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int t=2;
		rotateArray(arr,t);
		
	}

}
