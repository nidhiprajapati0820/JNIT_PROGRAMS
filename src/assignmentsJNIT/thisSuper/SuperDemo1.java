package assignmentsJNIT.thisSuper;

abstract class Car {
	String model;

	abstract void cost();

	abstract void mileage();

	Car() {
		System.out.println("I am constructor of Abstract");
	}

	Car(String model) {
		this();
		this.model = model;
		System.out.println("This model is:  " + model);
	}

	void start() {
		System.out.println("Starts with a key");
	}
}

class Audi extends Car {

	Audi() {
		super("Audi A8");
	}

	void cost() {
		System.out.println("Audi cost is 30K");
	}

	void mileage() {
		System.out.println("Audi mileage is 23 miles per gallon");
	}

}

class BMW extends Car {
	
	BMW() {
		super("BMW X5");
	}

	void cost() {
		System.out.println("BMW cost is 40K");
	}

	void mileage() {
		System.out.println("BMW mileage is 25 miles per gallon");
	}

}

public class SuperDemo1 {
	public static void main(String[] args) {

		Car audi = new Audi(); /* Car x; x = new Audi(); */
		audi.cost(); /* x.cost */
		audi.mileage(); /* x.mileage */

		Car bmw = new BMW(); /* x = new BMW */
		bmw.cost(); /* x.cost */
		bmw.mileage(); /* x.mileage */
	}

}
