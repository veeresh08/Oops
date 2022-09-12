package arrays;

import java.util.Scanner;

public class ArrangeArray {
	
	public static void printArray(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
				 System.out.println(arr[i]);
		  }
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
  int arr[] = new int[n];
  int start =0;
  
  for(int i = 0 ; i <= n-1/2 ; i++) {
	  if(i%2!=0) {
		  arr[start]=i;
		  start++;
	  }
  }
  
  int end=2;
  for(int i = n-1; i>=n/2;i--) {
	  if(end%2==0) {
		  arr[i]=end;
		  end+=2;
	  }
  }
  
  printArray(arr);

}
}
