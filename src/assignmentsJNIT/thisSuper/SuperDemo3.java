package assignmentsJNIT.thisSuper;

class Animal {
	String name;
	
	void animalSound() {
		System.out.println("The animal [" + name + "] makes a sound");
	}

	Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	Dog( String name){
		super(name);
	}

	void animalSound() {

		super.animalSound(); // Call the superclass method

		System.out.println("The dog says: bow wow");
	}
}

public class SuperDemo3 {

	public static void main(String[] args) {
		Animal myDog = new Dog("BullDog"); // Create a Dog object
		myDog.animalSound(); // Call the method on the Dog object

	}

}
