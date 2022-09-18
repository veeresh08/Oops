package collections;
import java.util.*;

public class StartCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("veeresh");
		names.add("jhon");
		names.add("ajith");
		names.add("jhon");
		names.add("sheetal");
		names.add("dix");
		
		//remove
		names.remove(2);
		
		
		System.out.println(names);
		System.out.println(names.get(2));
		
		LinkedList list = new LinkedList();
		
		list.add("Sachin");
		list.add(101);
		list.add(7);
		
		names.remove(2);
		
		System.out.println(list);
		
		
		//size
		System.out.println("SIZE = "+names.size());
		
		
		
		//check item is there or not 
		System.out.println(names.contains("ajith"));
		
	
		//check for empty
		System.out.println(names.isEmpty());
		
//		//setting value
//		names.set(1, "ram");
//		System.out.println(names);
		
		
		
		names.add(1,"ramesh");
		System.out.println(names);
		
		
//		names.clear();
		
		System.out.println(names);
		
		Vector<String> vector = new Vector<>();
		vector.addAll(names);
		System.out.println("Vector"+vector);
		
		
		System.out.println("_____________________________");
		
		
		HashSet<Double> nms = new HashSet<>();
		
		nms.add(14.13);
		nms.add(1.13);
		nms.add(17.17);
		nms.add(15.1);
		nms.add(16.1);
		nms.add(13.1);
		nms.add(10.1);
		nms.add(10.1);
		
		nms.add(new Double(232.3));
		System.out.println(nms);
		
		
		TreeSet<Double> tset = new TreeSet<>();
		tset.addAll(nms);
		System.out.println(tset);
		
		
		
		
	
		
		
		
		
		
		
	}

}
