package assignmentsJNIT.polymorphism;

class furniture {

	void material() {
		System.out.println("Furnitures are different material");
	}

	void type() {
		System.out.println("Furnitures in different type\n");
	}

}

class couch extends furniture {

	void material() {
		System.out.println("Leather couches   ");
	}

	void type() {
		System.out.println("Recliners\n");
	}

}

class bed extends furniture {

	void material() {
		System.out.println("Wooden Material   ");
	}

	void type() {
		System.out.println("Bunk bed ");
	}
}

public class Methodoverriding1 {
	public static void main(String[] args) {
		furniture f = new furniture();
		f.material();
		f.type();

		f = new couch();
		f.material();
		f.type();

		f = new bed();
		f.material();
		f.type();

	}

}
