package classesandobject2;

public class Student {
  
	public String name;
	final private int rollNumber;
	double cgpa;
	final static double conversionFactor = 0.95;
	private static int numStudent;
	
	
	public Student(String name, int rollNumber) {
		this.name =name;
		this.rollNumber = rollNumber;
		numStudent++;	
	}
	
//	public Student(String n) {
//		name = n;
//		
//		
//	}
//	
	public Student() {
		name ="default";
		rollNumber = 90;
	}
	
	public static int getNumStudent() {
		//System.out.println(rollNumber);
		return numStudent;
	}
	
	public void print() {
		System.out.println(name + " " + rollNumber);
	}
	
	public int getRollNumber() {
		return this.rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		if(rollNumber<=0) {
			return;
		}
		System.out.println("this : " + this);
//		this.rollNumber = rollNumber;
	}
}
 