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
		System.out.println("Audi mileage is 23 miles per gallon");
	}
	
}

class BMW extends Car {

	void cost() {
		System.out.println("BMW cost is 40K");
	}

	void mileage() {
		System.out.println("BMW mileage is 25 miles per gallon");
	}
	
}

public class AbstractDemo1 {

	public static void main(String[] args) {
		Car audi = new Audi(); /* Car x; x = new Audi();  */
		audi.cost();           /* x.cost */  
		audi.mileage();        /* x.mileage */
		 audi.start();  
		 
		 Car bmw = new BMW();    /* x = new BMW */
		bmw.cost();             /* x.cost */
		bmw.mileage();  
		  bmw.start();                    /* x.mileage */
	}

}
