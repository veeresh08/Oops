package fractionClassExample;

public class Fraction {
	
	private int numerator;
	private int denominator;

	
	public Fraction(int numerator, int denominator) {
		// TODO Auto-generated constructor stub
		if(denominator==0) {
			denominator =1;
		}
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();	
	}
	public void setNumerator(int num) {
		this.numerator =num;
		simplify();
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int num) {
		if(num == 0) {
			return;
		}
		this.denominator = num ;
		simplify();
		
	}
	
	public int getDenominator() {
		return denominator;
		
	}
	private void simplify() {
		int gcd = 1;
		
		int smaller= Math.min(numerator, denominator);
		 
		for(int i = 2; i <= smaller; i++) {
			if(numerator%i==0 && denominator%i ==0) {
				gcd = i;
			}
		}
		
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}

	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println(numerator +"/"+ denominator);
	}

	public void increment() {
		// TODO Auto-generated method stub
		numerator = numerator+denominator;
		simplify();
	}
	
	public void add(Fraction f2) {
		// first fraction is the fraction on which function is called
		// second fraction is passed as argument
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
	}
	
	

	

}
