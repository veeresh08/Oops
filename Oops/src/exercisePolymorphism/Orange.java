package exercisePolymorphism;

class Orange extends Fruit {
	
	Orange() {
		name = "Orange";
		taste = "sweet-tert";
	}
	
	
	void eat() {
		System.out.println(name + " is "+ taste + " in taste.");
	}	
}
