package classesandobject2;


public class StudentUse {
	
	public static void main(String args[]) {
		System.out.println(Student.getNumStudent());
		Student s1 = new Student("ajith", 35);
		
		
		final Student st= (Student) new Object();
		
		
//		s1.print();
	 
	
//		s1.name = "Veeresh";
//		System.out.println("s1 : "+ s1);
//		s1.setRollNumber(400);
//		System.out.println(s1.name+ " " + s1.getRollNumber());
		
		
		Student s2 = new Student("sam", 123);
		
//		Student s3 = new Student("ajay", 12433);
//		System.out.println(s1.getNumStudent());
//		System.out.println(s2.getNumStudent());
//		System.out.println(s3.numStudent);
		
		System.out.println(Student.getNumStudent());
		
//		s2.print();
//		System.out.println("s1 : "+ s2);
//		s2.setRollNumber(100);
//     	s2.name = "Ankush";
//		s2.rollNumber = 50;
//		System.out.println(s2.name+" ");
//		System.out.println(s2.name+ " "+ s2.getRollNumber());
//		System.out.println(s1.rollNumber);
		
		
	}
}


