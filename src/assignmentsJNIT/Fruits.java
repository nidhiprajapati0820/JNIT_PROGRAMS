package assignmentsJNIT;

class FruitSpecification {
	String name;
	String color;
	int count;

	FruitSpecification() {
		name = "Apple";
		color = "Red";
		count = 12;
	}

	FruitSpecification(String x, String y, int z) {
		name = x;
		color = y;
		count = z;
	}

	void display() {
		System.out.println("\nName of fruit is:  " + name + "\nColor: " + color + " \nAvailable in count: " + count);
	}
}

public class Fruits {
	public static void main(String[] args) {
		FruitSpecification f1 = new FruitSpecification();
		FruitSpecification f2 = new FruitSpecification("Banan", "yellow", 20);
		f1.display();
		f2.display();
	}
}
