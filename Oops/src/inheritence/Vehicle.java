package inheritence;

public class Vehicle {
	
	private String color;
	protected int maxSpeed;

	
	public Vehicle(int maxSpeed) {
		System.out.println("Vehicle constructor");
		this.maxSpeed = maxSpeed;
	}
	
	public Vehicle() {
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void print(){
		System.out.println("Vehicle " + " color " +color+" maxspeed "+ maxSpeed);
	}
}
