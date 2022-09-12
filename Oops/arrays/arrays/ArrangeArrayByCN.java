package arrays;

import java.util.Scanner;

public class ArrangeArrayByCN {
	public static void printArray(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
				 System.out.println(arr[i]);
		  }
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	  int arr[] = new int[n];
	  int left=0;
	  int right= n-1;
	  int counter=1;
	  
	  while(left<=right) {
		  if(counter%2==1) {
			  arr[left] = counter;
			  counter+=1;
			  left+=1;
			  
		  }else {
			  arr[right] = counter;
			  counter+=1;
			  right-=1;
		  }
	  }
	  
	  printArray(arr);

}
}
