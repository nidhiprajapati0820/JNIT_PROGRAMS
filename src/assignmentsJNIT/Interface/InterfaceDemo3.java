package assignmentsJNIT.Interface;

interface RestaurantFacility {
	void reception();
	void publicRestRoom();
}

interface LodgingFacility {
	void privebBedroom();
	void privateRestRoom();
}

abstract class HotelFacility implements LodgingFacility, RestaurantFacility {
	void payment() {
		System.out.println("Cash payment only");
	}
}

class RadissonHotel extends HotelFacility {

	public void publicRestRoom() {
		System.out.println("Hotel has public rest room");
	}

	public void privebBedroom() {
		System.out.println("Hotel has private bedrooms");
	}

	public void privateRestRoom() {
		System.out.println("Hotel has private restroom");
	}

	public void reception() {
		System.out.println("Hotel has reception area");
	}
	
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		RadissonHotel h = new RadissonHotel();
		h.publicRestRoom();
		h.reception();
		h.privateRestRoom();
		h.privebBedroom();
		h.payment();

	}

}
