package practice;

class CrowModel {
	int rooms = 4;
	
	public void bathroom() {
		System.out.println(this + " have 3 baths and rooms "+ this.rooms);
	}
	public void myId() {
		System.out.println("My id is " + this);
	}
	public void courtyard() {
		System.out.println("This is courtyard of " + this);
		this.myId();
	}
}

class ExtendedCrowModel extends CrowModel {
	int rooms = 5;
	
	public void myId() {
		System.out.println(rooms);
		System.out.println(super.rooms);
	}
	
	
}


public class CrowDemo {
	public void test() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		CrowModel nidhiHouse = new CrowModel(); //lot55
		CrowModel backNeighbor = new CrowModel(); //lot158
		
		nidhiHouse.courtyard();
		nidhiHouse.bathroom();
		
		System.out.println(nidhiHouse.rooms);
		System.out.println(backNeighbor.rooms);
		
		CrowDemo c = new CrowDemo();
		c.test();

	}

}
