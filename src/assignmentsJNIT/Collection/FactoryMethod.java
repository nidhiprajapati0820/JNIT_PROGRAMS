package assignmentsJNIT.Collection;

abstract class Car {
	abstract void cost();

	abstract void milage();

	void start() {
		System.out.println("Starts with a key");
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

class CarFactory {

	Car getCarObject(String carName) {
		if (carName.equals("Audi"))
			return new Audi();
		else if (carName.equals("BMW"))
			return new Bmw();
		else
			return null;
	}
}

public class FactoryMethod {

	public static void main(String[] args) {
		CarFactory cf = new CarFactory();
		Car x = cf.getCarObject("BMW");
		x.cost();
		x.milage();
		x.start();

		x = cf.getCarObject("Audi");
		x.cost();
		x.milage();
		x.start();
	}

}
