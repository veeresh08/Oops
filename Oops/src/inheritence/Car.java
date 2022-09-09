package inheritence;

public class Car extends Vehicle {
	int numDoors;
	int maxSpeed;
	
	
	public  Car(int numDoors,int maxSpeed) { 
		super(100);
		System.out.println("Car's constructor");
		this.numDoors = numDoors;
	}
	public void print(){
		super.print();
		System.out.println("car" +" numDoors "+ numDoors);
	}
	
	public void printMaxSpeed() {
		super.maxSpeed = 150;
		System.out.println(maxSpeed + " " + super.maxSpeed);
	}
}
