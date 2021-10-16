package assignmentsJNIT.polymorphism;

class University {

	void selectionOfCollege(int code) {
		System.out.println("college name is NWS code is: " + code);
	}

	void selectionOfCollege(int code, String name) {
		System.out.println("\ncollege code is:" + " " + code + "and name of college " + " " + name); // Different Type of Parameter
	}

	void selectionOfCollege(String name, int code) {
		System.out.println("college name is NWS code is: " + code); // Different order of parameter
	}

	void selectionOfCollege(int rank, int placement, String campus) {
		System.out.println("\nTop rank:" + rank + " " + "Placement in %: " + placement + " " + campus); // Different number of parameter
	}

}

public class Students {

	public static void main(String[] args) {
		University phoenixAz = new University();
		phoenixAz.selectionOfCollege(2);
		phoenixAz.selectionOfCollege(3, "Birla Engg\n");
		phoenixAz.selectionOfCollege("VIT", 4);
		phoenixAz.selectionOfCollege(3, 100, "Beautiful");
	}

}
