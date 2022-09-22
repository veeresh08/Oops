 package collections;
 import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String,Integer> courses = new HashMap();
		
		//adding elements
		courses.put("Core java", 4000);
		courses.put("basic python", 7000);
		courses.put("Spring", 6000);
		courses.put("android", 4500);
		courses.put("android", 4000);
		courses.put("php", 4000);
		
		System.out.println(courses);
		
//		courses.forEach((e1,e2)->{
//			System.out.println(e1+"=>"+e2);
//		});
		

		courses.forEach((key,value)->{
			System.out.print(key);
			System.out.print("=>");
		 	System.out.print(value);
		 	System.out.println();
			
		});
		
		//entry set
		//key set
	}
}
