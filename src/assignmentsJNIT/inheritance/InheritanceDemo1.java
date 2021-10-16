package assignmentsJNIT.inheritance;

class Animal {
	String name;

	void eat() {
		System.out.println("i can eat chapati");
	}
}

class Dog extends Animal {
	String behaviour;

	Dog(String x) {
		behaviour = x;
	}

	void display() {
		System.out.println("my name is " + name + " and i am " + behaviour);
	}

}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		Dog D1 = new Dog("kids friendly");
		D1.name = "Briand";
		D1.display();
		D1.eat();
	}
}
