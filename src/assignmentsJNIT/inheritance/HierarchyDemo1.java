package assignmentsJNIT.inheritance;

class Animal0 {
	String name;
	String type;
}

class Lion extends Animal0 {
	String breed;
	int maxAge = 40;

	Lion(String x, String y, String z) {
		name = x;
		type = y;
		breed = z;
	}

	void displayDetail() {
		System.out.println("Animal name: " + name + ", Eating habit: " + type + ", Breed: " + breed + ", Max age: " + maxAge + " yrs");
	}
}

class Cow extends Animal0 {
	String color;

	Cow(String x, String y, String z) {
		name = x;
		type = y;
		color = z;
	}

	void displayDetail2() {
		System.out.println("Animal name: " + name + ", Eating habit: " + type + ", Color: " + color);
	}
}

public class HierarchyDemo1 {

	public static void main(String[] args) {
		Lion l = new Lion("Panther", "Carnivoros", "American");
		Cow c = new Cow("Jersey", "Herbivoros", "White");
		
		l.displayDetail();
		c.displayDetail2();
	}
}
