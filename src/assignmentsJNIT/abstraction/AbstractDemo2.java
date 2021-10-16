package assignmentsJNIT.abstraction;

abstract class Restaurant {
	abstract void address();
	abstract void rating();
	abstract void flavor();
	void city() {
		System.out.println("Restaurant is located in Phoenix AZ");
	}
	void petFriendly() {
		System.out.println("Restaurant is pet friendly");
	}
}

class PubjabiTadka extends Restaurant{

	void address() {
		
	}

	void rating() {
		
	}

	void flavor() {
		
	}

	
}

class HyderabadiRasoi extends Restaurant{

	void address() {
		
	}

	void rating() {
		
	}

	void flavor() {
		
	}
	
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
