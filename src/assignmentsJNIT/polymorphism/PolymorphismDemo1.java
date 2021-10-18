package assignmentsJNIT.polymorphism;

class Restuarant {

	void takeOrder(String order) {
		System.out.println("order given is " + order);
	}

	void takeOrder(String order, String order1) {
		System.out.println("order given is " + order + " and  " + order1); // Different Number of Parameter
	}

	void takeOrder(int quantity, String typeOfOrder) {
		System.out.println("Number of quantity: " + quantity + " and " + typeOfOrder);// Different Type of parameter
	}

	void takeOrder(String typeOfOrder, int quantity) {
		System.out.println("Type of order: " +  typeOfOrder + " and " + quantity);// Different order of parameter
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		Restuarant ohris = new Restuarant();
		ohris.takeOrder("Dosa\n");
		ohris.takeOrder("Dosa", "Poori\n");
		ohris.takeOrder(5, "Togo\n");
		ohris.takeOrder( "Table", 2);
	}

}