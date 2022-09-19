package arrays;

import java.util.Scanner;

public class InputOfArray {
	
	public static void printArray(int arr[]) {
		  for(int i = 0 ; i<arr.length;i++) {
	    	  System.out.println(arr[i]);
	      }
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
