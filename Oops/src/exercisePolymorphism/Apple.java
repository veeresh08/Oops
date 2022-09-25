package exercisePolymorphism;

class Apple extends Fruit {
	Apple() {
		name = "Apple";
		taste = "sweet and caramelized";
	}
	
	
	void eat() {
		System.out.println(name + " is "+ taste + " in taste.");
	}
}