package functions;

import java.util.Scanner;

public class NcR {
	
	public static   int factorial(int num) {
		int fact =1;
		for(int i = 1; i <= num; i++) {
			fact = fact *i;
		}
		return fact;
	}
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int r = s.nextInt();
	int factN = factorial(n);
	int factR = factorial(r);
	int factNR = factorial(n-r);
	
	
	System.out.println("fact n = " + factN);
	System.out.println("fact r = " + factR);
	System.out.println("fact NR = " +factNR);
	
	int factNandNR= factR* factNR;
	System.out.println("fact N X R = "+ factNandNR);
	
	int result = factN/factNandNR;
	System.out.println(result);
//sc.close();
	
}

}
