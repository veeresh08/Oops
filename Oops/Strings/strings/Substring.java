package strings;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "pqrs";
		
		int length =  str.length();
		
		for(int i=0;i<length;i++) {
			for(int j=i;j<length;j++) {
				System.out.println(str.substring(i, j +1));	
			}
		}
		
		
		
		
	}
}
