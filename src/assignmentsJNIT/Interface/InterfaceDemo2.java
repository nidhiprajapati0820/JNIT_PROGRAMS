package assignmentsJNIT.Interface;

interface GeneralInfo {
	 String address();
	 double rating();
	 void flavor();
}

abstract class Restaurant implements GeneralInfo{
	void city() {
		System.out.println("Restaurant is located in Phoenix AZ");
	}

	void petFriendly() {
		System.out.println("Restaurant is pet friendly");
	}
}

class GujaratiTadka extends Restaurant {

	public String address() {
		String add = "274 N Tatum Road Phoenix";
		System.out.println(add);
		return add;
	}

	public double rating() {
		double rate = 3.5;
		return rate;
	}

	public void flavor() {
		System.out.println("Sweet");
	}

	void display() {
		System.out.println("Hello i am GujratiTadka");
	}

}

class HyderabadRasoi extends Restaurant {

	public String address() {
		String add = "4043 Bell Road Phoenix";
		System.out.println(add);
		return add;
	}

	public double rating() {
		double rate = 4.5;
		return rate;
	}

	public void flavor() {
		System.out.println("Spicy");

	}

	void display() {
		System.out.println("Hello i am HyderabadRasoi");
	}

}

public class InterfaceDemo2 {

	public static void main(String[] args) {

		Restaurant x = new GujaratiTadka();
		x.address();
		x.city();
		System.out.println(x.rating());
		x.flavor();
		x.petFriendly();
		GujaratiTadka y = new GujaratiTadka();
		y.display();
		System.out.println("***************************");
		 x = new HyderabadRasoi();
		x.address();
		x.city();
		System.out.println(x.rating());
		x.flavor();
		x.petFriendly();
		

	}

}

