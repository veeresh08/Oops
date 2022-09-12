package strings;

import java.util.Scanner;

public class Example_3_ReverseString {
	
	public static String reverse(String str) {
		String str2="";

//		for(int i = str.length()-1;i>=0;i--) {
//			str2+= str.charAt(i);
//
//		}
//		method-2
		for(int i = 0;i<str.length();i++) {
			str2= str.charAt(i) + str2;
		}
		return str2;
	}
	
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String str2 = reverse(str);
	System.out.println(str2);
//	System.out.println(str2.length());

}
}
