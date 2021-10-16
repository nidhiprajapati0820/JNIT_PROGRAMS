package assignmentsJNIT.abstraction;

abstract class Technology {
	abstract void web();
	abstract void developer();

	void editor() {
		System.out.println("Eclipse");
	}
}

class React extends Technology {
	void web() {
		System.out.println("This is a web technology");
	}

	void developer() {
		System.out.println();
	}
}

class Java extends Technology {
	void web() {

	}

	void developer() {

	}
}

public class AbstractDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
