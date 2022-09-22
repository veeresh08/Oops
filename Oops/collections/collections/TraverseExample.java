package collections;

import java.util.ArrayList;
import java.util.*;

public class TraverseExample {
public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();
	names.add("veeresh");
	names.add("jhon");
	names.add("ajith");
	names.add("jhon");
	names.add("sheetal");
	names.add("dix");
	
	
	//for each loop
	for(String str: names) {
		System.out.print(str+"\t"+str.length()+"\t");
		StringBuffer br = new StringBuffer(str);
		System.out.println(br.reverse());
	}
	
	System.out.println("________________________________");
	
	
	//traversing  using ITERATOR : forward traversing
	
	Iterator<String> itr = names.iterator();
	
	while(itr.hasNext()) {
		String next = itr.next();
		System.out.println(next);
	}
	
	System.out.println("++++++++++++++++++++++++++++++++");

	
	//backward traversal of collection LISTITIRATOR
	ListIterator<String> litr = names.listIterator(names.size());
	while(litr.hasPrevious()) {
		String next = litr.previous();
		System.out.println(next);
	}
	
	
	System.out.println("_____________Enumuration method_______________");
	
	//EnumerationW


			Vector<String> vctr = new Vector<String>();    
			
			vctr.add("hi");  
			vctr.add("hello");  
			vctr.add("this");  
			vctr.add("is");  
			vctr.add("enum");  
			vctr.add("collection");  
			
			       Enumeration<String> en = Collections.enumeration(vctr);  
			            System.out.println("The Enumeration List is");  
			            while(en.hasMoreElements()){  
			                 System.out.println(en.nextElement());  
			            }
			            
			            
			            
	System.out.println("_____________For each method_______________");
	
	//for each method
	for(String str:names) {
		System.out.println(str);
	}
	
	names.forEach(e->{
		System.out.println(e);
	});
	
	System.out.println("____________Sorting elements_______________");

	TreeSet<String> set = new TreeSet<>();
	set.addAll(names);
	set.forEach(e->{
		System.out.println(e);
	});
	
	//comparable
	//comparator
	
	 
}
}
