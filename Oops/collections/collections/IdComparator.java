package collections;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp1> {

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		
		return o1.getEmpId()-o2.getEmpId();
	}
	
}
