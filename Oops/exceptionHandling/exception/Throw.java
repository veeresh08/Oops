package exception;

//public class Throw {
//	static void avg() {
//		try {
//			throw new ArithmeticException("Demo");
//		}catch(ArithmeticException e) {
//			System.out.println("Exception cought");
//		}
//	}
//	
//	public static void main(String[] args) {
//		avg();
//	}
//}

public class Throw {
	static void avg()throws ArithmeticException {
	
			System.out.println("inside avg function");
			throw new ArithmeticException("Demo");
		
	}
	
	public static void main(String[] args) {
		try {
			avg();
		} finally {
			System.out.println("cought");
		}
	}
}
