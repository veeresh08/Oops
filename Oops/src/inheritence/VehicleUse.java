package inheritence;

import java.util.Scanner;

public class VehicleUse {
	public static void main(String[] args) {
		
		
		Vehicle v = new Car(4,100);
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n = s.nextInt();
		if(n<10) {
			v = new Car(4,100);
		}else {
			v = new Vehicle();
		}
		
		v.print();
//		v.printMaxSpeed();
		
		
//		v= new Bicycle();
//		v.maxSpeed = 100;
//		v.numDoors = 4;
//		v.print();
//		Vehicle v2 = new Bicycle();
			
//		Vehicle v = new Vehicle();
//		Car c = new Car(5,4);
//		c.print();
//		
		
		
//		Vehicle v = new Vehicle();
//		v.setColor("Red");
//		v.maxSpeed = 80;
//		v.print();
//		
//		Car c = new Car();
//		c.setColor("Black");
//		c.maxSpeed = 100;
//		c.numDoors = 4;
//		c.printMaxSpeed();
//		c.print();
//		c.printCar();
		
//		Bicycle b = new Bicycle();
//		b.print();
	}
	
}
