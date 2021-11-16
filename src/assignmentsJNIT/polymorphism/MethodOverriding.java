package assignmentsJNIT.polymorphism;

class Car {
	void cost() {
		System.out.println("No cast");
	}

	void milage() {
		System.out.println("No Milage");
	}
}

class Audi extends Car {
	void cost() {
		System.out.println("\nAudi cast is 50 lakhs ");
	}

	void milage() {
		System.out.println("Audi milage is 15KM");
	}

}

class Bmw extends Car {
	void cost() {
		System.out.println("\nBMW cast is 40 lakhs");
	}

	void milage() {
		System.out.println("Audi milage is 10KM");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Car x = new Car();
		x.cost();
		x.milage();

		x = new Bmw();
		x.cost();
		x.milage();

		x = new Audi();
		x.cost();
		x.milage();

	}

}
