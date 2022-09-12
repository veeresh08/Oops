package arrays;

import java.util.Scanner;

public class LinearSearch {
	public static void printArray(int arr[]) {
		  for(int i = 0 ; i<arr.length;i++) {
	    	  System.out.println(arr[i]);
	      }
	}
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int arr[]= new int[n];
		 for(int i =0; i<n;i++) {
	          System.out.println("enter element at"+ i +"th index: ");
	          arr[i] = sc.nextInt();
	      }
		 
		 return arr;
	}
	public static int printArrayindex(int arr[],int n) {
		int flag=0;
		for(int i =0; i <arr.length;i++) {
			if(arr[i]==n) {
			
				flag=1;
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		printArray(arr);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element to be searched");
		
		int n = sc.nextInt();
		int position = printArrayindex(arr,n);
		System.out.println("position is :  "+ position);

	}
	
}
