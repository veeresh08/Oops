package arrays;

public class PrintAllPairs {
	public static void printPairs(int[] arr) {
		for(int i = 0;i < arr.length-1;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				
				System.out.println("("+arr[i]+" "+arr[j]+')');
				System.out.print(" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,7,6,5};
		printPairs(arr);
		
	}

}
