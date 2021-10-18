package assignmentsJNIT.abstraction;

abstract class Restaurant {
	abstract String address();

	abstract double rating();

	abstract void flavor();

	void city() {
		System.out.println("Restaurant is located in Phoenix AZ");
	}

	void petFriendly() {
		System.out.println("Restaurant is pet friendly");
	}
}

class GujaratiTadka extends Restaurant {

	String address() {
		String add = "274 N Tatum Road Phoenix";
		System.out.println(add);
		return add;
	}

	double rating() {
		double rate = 3.5;
		return rate;
	}

	void flavor() {
		System.out.println("Sweet");
	}

	void display() {
		System.out.println("Hello i am GujratiTadka");
	}

}

class HyderabadRasoi extends Restaurant {

	String address() {
		String add = "4043 Bell Road Phoenix";
		System.out.println(add);
		return add;
	}

	double rating() {
		double rate = 4.5;
		return rate;
	}

	void flavor() {
		System.out.println("Spicy");

	}

	void display() {
		System.out.println("Hello i am HyderabadRasoi");
	}

}

public class AbstractDemo2 {

	public static void main(String[] args) {

		Restaurant x = new GujaratiTadka();
		x.address();
		x.city();
		System.out.println(x.rating());
		x.flavor();
		x.petFriendly();
		System.out.println("***************************");
		 x = new HyderabadRasoi();
		x.address();
		x.city();
		System.out.println(x.rating());
		x.flavor();
		x.petFriendly();
		//x.display();

	}

}
