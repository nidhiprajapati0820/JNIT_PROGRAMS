package assignmentsJNIT.polymorphism;

class Plant {
	void indoorPlant() {
		System.out.println("Indoor catagries ");
	}

	void outdoorPlant() {
		System.out.println("outdoor cotagories\n");
	}
}

class Lily extends Plant {
	void indoorPlant() {
		System.out.println("Lily is a indoor plants ");
	}

	void outdoorPlant() {
		System.out.println("its not outdoor plants\n");
	}
}

class hibiscus extends Plant {
	void indoorPlant() {
		System.out.println("its  not outdoor plant ");
	}

	void outdoorPlant() {
		System.out.println("Hibiscus is outdoor plant");
	}
}

public class MethodOverridingDemo2 {

	public static void main(String[] args) {
		Plant p = new Plant();
		p.indoorPlant();
		p.outdoorPlant();

		p = new Lily();
		p.indoorPlant();
		p.outdoorPlant();

		p = new hibiscus();
		p.indoorPlant();
		p.outdoorPlant();

	}

}
