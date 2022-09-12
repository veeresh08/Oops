package strings;

import java.util.Scanner;

//code to print all chars of strings in seperate lines
public class Example_1 {
	
	public static void print(String str) {
		for(int i = 0; i< str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		print(str);
	}
}
