package arrays;

import java.util.Scanner;

public class LargestEle {
	public static int[] takeinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("enter array elements");
		for(int i = 0; i < n ; i++) {
			System.out.println("element at "+i+"th position");
			arr[i]=sc.nextInt();
		}
		
		
		
		return arr;
	}
	
	private static void printlargest(int arr[]) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i< arr.length ;i++) {
		
			System.out.println(arr[i]);
		}
		
	}
	public static void findLargest(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("the largest is "+max);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = takeinput();
		
		printlargest(arr);
		
		findLargest(arr);

	}


	

}
