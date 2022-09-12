package strings;

import java.util.Iterator;
import java.util.Scanner;

//Count Words
//
//For a given input string(str), find and return the total number of words present in it.
//It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.
//Input Format:
//The first and only line of input contains a string without any leading and trailing spaces.
//Output Format:
//The only line of output prints an integer value denoting the tool number of words present in the string.
//Note:
//You are not required to print anything. It has already been taken care of.
//Constraints:
//0 <= N <= 10^6
//Where N is the length of the input string.

public class Example_2 {
	
	public static void printWordCount(String str) {
		int length = str.length();
		int count = 1;
		for (char i : str.toCharArray()) {
			if(i == ' ') {
				count++;
				
			}
			
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printWordCount(str);
		
	}
}
