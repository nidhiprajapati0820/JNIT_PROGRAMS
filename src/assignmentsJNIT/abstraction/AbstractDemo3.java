package assignmentsJNIT.abstraction;

abstract class Technology {
	abstract void web();

	abstract void developer();

	void editor() {
		System.out.println("Developer can use Eclipse for development");
	}
}

class React extends Technology {
	void web() {
		System.out.println("React is a web technology");
	}

	void developer() {
		System.out.println("React is developed by Facebook");
	}
}

class Java extends Technology {
	void web() {
		System.out.println("Java is a not a web technology");
	}

	void developer() {
		System.out.println("Java is developed by Oracle");
	}
}

public class AbstractDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
