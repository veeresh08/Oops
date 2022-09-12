package strings;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		char arr[] = {'h','e','l','l','o'};
		String str = "hello";
		String str1 = " bro";
		System.out.println(str1.length());
		System.out.println(str.charAt(4));
		System.out.println(str+str1);
		System.out.println(str.equals(str1));
		System.out.println(str1.contains("veer"));
		System.out.println(str.substring(2,4));
		
		Scanner sc = new Scanner(System.in);
		
		String str2;
		str2 = sc.next();
//		str2 = sc.nextLine();		
		System.out.println(str2+ " " + str2.length());
	}
}
