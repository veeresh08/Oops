package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;



public class CrudDemo {
public static void main(String[] args) {
		
		List<Employee> c = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		
		
		
		int ch;
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("Update");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter Empno : ");
				int eno = sc.nextInt();
				System.out.println("Enter EmpName : ");
				String ename = s1.nextLine();
				System.out.println("Enter salary : ");
				int salary = sc.nextInt();
				c.add(new Employee(eno,ename,salary));
				break;
			case 2:
				System.out.println("--------------------------------");
				Iterator<Employee> i = c.iterator();
				while(i.hasNext()) {
					Employee e = i.next();
					System.out.println(e);
				}
				System.out.println("--------------------------------");
				break;
				
			case 3:
				boolean found = false;
				System.out.println("Enter empno to search : ");
				eno = sc.nextInt();
				System.out.println("--------------------------------");
				i = c.iterator();
				
			
				
				while(i.hasNext()) {
					Employee e = i.next();
					if(e.getEmpno() == eno) {
						System.out.println(e);
						found = true;
					}
				}
				
				if(!found) {
					System.out.println("Record not found");
				}
				System.out.println("--------------------------------");
				break;
				
			case 4:
				boolean found1 = false;
				System.out.println("Enter empno to delete : ");
				eno = sc.nextInt();
				System.out.println("--------------------------------");
				i = c.iterator();
				
			
				
				while(i.hasNext()) {
					Employee e = i.next();
					if(e.getEmpno() == eno) {
						i.remove();
						found1 = true;
					}
				}
				
				if(!found1) {
					System.out.println("Record not found");
				}else {
					System.out.println("Recor is deleted sucessfully");
				}
				System.out.println("--------------------------------");
				break;
			case 5:
				boolean found11 = false;
				System.out.println("Enter empno to update : ");
				eno = sc.nextInt();
				System.out.println("--------------------------------");
				ListIterator<Employee> li = c.listIterator();
				
				

				while(li.hasNext()) {
					Employee e = li.next();
					if(e.getEmpno() == eno) {
						System.out.println("Enter new name : ");
						ename = s1.nextLine();
						
						System.out.println("Enter new salary : ");
						salary = sc.nextInt();
						li.set(new Employee(eno,ename,salary));
						found11 = true;
					}
				}
				
				if(!found11) {
					System.out.println("Record not found");
				}else {
					System.out.println("Recor is updated sucessfully");
				}
				System.out.println("--------------------------------");
				break;
			}
		}while(ch!=0);
		
	}
}
