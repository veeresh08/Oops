package collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp1> {

	

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
