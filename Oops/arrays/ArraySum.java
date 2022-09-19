package arrays;

import java.util.Scanner;

public class ArraySum {
	
	public static void printArray(int arr[]) {
		int ans = 0;
		for(int i = 0; i < arr.length ;i++) {
			ans+=arr[i];
		}
		System.out.println("array elements are: ");
		  for(int i = 0 ; i<arr.length;i++) {
	    	  System.out.println(arr[i]);
	      }
		  
		 System.out.println("Array sum is: " +ans);
		 
	}
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size: ");
		int n = sc.nextInt();
	    int arr[]= new int[n];
		 for(int i =0; i<n;i++) {
	          System.out.println("enter element at "+ i +"th index: ");
	          arr[i] = sc.nextInt();
	      }
		 
		 return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		printArray(arr);
		
	}

}
