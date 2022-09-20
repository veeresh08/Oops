package exception;
import java.util.*;
import java.util.Scanner;
public class CustomeException {
	static void validInput(int number) throws InvalidInputException{
		if(number>100) {
			throw new InvalidInputException("Exception");
		}
		System.out.println("valid input");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number less than 100");
		int number = sc.nextInt();
		try {
			validInput(number);
			
		}catch(InvalidInputException e) {
			System.out.println("caught exception - input is greater than 100");
		}
	}
}

class InvalidInputException extends Exception{
	InvalidInputException(String exceptionText){
		super(exceptionText);
	}
}