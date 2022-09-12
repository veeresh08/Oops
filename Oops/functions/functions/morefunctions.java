package functions;

public class morefunctions {
	
	public static int sum(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void printEvenNumber() {
		for(int i =2;i<=100;i=i+2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1=10;
       int n2=20;
       System.out.println(sum(n1,n2));
       printEvenNumber();
       
       
	}

}
