package strings;

import java.util.Scanner;

public class Example_4_CheckPalindrome {
	public static boolean checkPalindrom(String str) {
//		String str2 = "";
//		String str3 = "";	
//		for(int i=str.length()/2-1;i>=0;i--) {
//			str2+=str.charAt(i);
//		}
//		System.out.println(str2);
//		
//		for(int i=str.length()/2;i<=str.length()-1;i++) {
//			str3+=str.charAt(i);
//		}
//		System.out.println(str3);
//		System.out.println(str2.equals(str3));
//		
//		Method 2
		
//		int count = str.length()-1;
//		for(int i = 0;i<str.length();i++) {
//			if(str.charAt(i)!=str.charAt(count)) {
//				return false;
//			}
//			count--;
//		}
//		return true;
		
//		Method 3
		int j = str.length()-1;
		int i =0;
		while(i<j) {
			
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
	
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(checkPalindrom(str));
	}
}
