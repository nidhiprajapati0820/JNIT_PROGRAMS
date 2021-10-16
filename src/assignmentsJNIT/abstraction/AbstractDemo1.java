package assignmentsJNIT.abstraction;

abstract class Car {
	abstract void cost();
	abstract void mileage();
	
	void start() {
		System.out.println("Starts with a key");
	}
}

class Audi extends Car {

	void cost() {
		System.out.println("Audi cost is 30K");
	}

	void mileage() {
		System.out.println("Audi mileage is 15 miles per gallon");
	}
	
}

class BMW extends Car {

	void cost() {
		System.out.println("BMW cost is 40K");
	}

	void mileage() {
		System.out.println("BMW mileage is 13 miles per gallon");
	}
	
}

public class AbstractDemo1 {

	public static void main(String[] args) {
		Car audi = new Audi();
		audi.cost();
		audi.mileage();
		
		Car bmw = new BMW();
		bmw.cost();
		bmw.mileage();
	}

}
