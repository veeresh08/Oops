package collections;



public class Emp1 {//implements Comparable<Emp1>{
	private String name;
	private String phone;
	private int empId;
	
//	@Override
//	public int compareTo(Emp1 o) {
//		
//		return this.empId-o.empId;
//	}
	
	
	public Emp1(String name,String phone, int empId) {
		this.name = name;
		this.phone = phone;
		this.empId = empId;
		
		
		
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}



	
	
	
}