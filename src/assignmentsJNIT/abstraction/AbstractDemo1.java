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
		System.out.println("Audi mileage is 15mpg");
	}
	
}

class BMW extends Car {

	void cost() {
		System.out.println("BMW cost is 40K");
	}

	void mileage() {
		System.out.println("BMW mileage is 13mpg");
	}
	
}

public class AbstractDemo1 {

	public static void main(String[] args) {
		Car audi = new Audi();
		audi.cost();
		
		Car bmw = new BMW();
		bmw.cost();
	}

}
