package classesandobjects;

public class Studentuse {
	
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1);  //package+classname+address
		s1.name = "Veeresh";
//		s1.rollNumber=78;
		s1.setRollNumber(300);
		System.out.println(s1.name+ " " + s1.getRollNumber());
		
		s2.name = "Ankush";
//		s2.rollNumber = 50;
		System.out.println(s2.name+" ");
//		System.out.println(s2.name+ " "+ s2.rollNumber);
//		System.out.println(s1.rollNumber);
		
		
	}
}


