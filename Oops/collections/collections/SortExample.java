package collections;
import java.util.*;
public class SortExample {

	public static void main(String[] args) {
		ArrayList<Emp1> emps = new ArrayList<>();
		emps.add(new Emp1("majeeth","9123812",938));
		emps.add(new Emp1("ajay","343",735));
		emps.add(new Emp1("dbhi","34355",373));
	
		
		System.out.println(emps);
		
		Collections.sort(emps,new IdComparator());
		
		//comparable
		System.out.println(emps);
		
		
		ArrayList<Emp1> emps1 = new ArrayList<>(emps);
		
		Collections.sort(emps1,new NameComparator());
		
		System.out.println(emps1);
	}
	
}


