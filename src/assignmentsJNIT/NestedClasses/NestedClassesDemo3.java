package assignmentsJNIT.NestedClasses;

class Transportation {

	void landTransport() {
		System.out.println("This is instance method of Transportation");

		class BusTransport {
			void interState() {
				System.out.println("This is local inner class");
			}
		}

		BusTransport br = new BusTransport();
		br.interState();

		AirTransport f = new AirTransport();
		f.domestic();
		f.international();

	}

	class AirTransport {
		void domestic() {
			System.out.println("This is method 1 of nested class");
		}

		void international() {
			System.out.println("This is method 2 of nested class ");
		}
	}

	static class WaterTransport {
		void underWater() {
			System.out.println("This is non static method of static nested class  ");
		}

		static void overWater() {
			System.out.println("This is static method of static nested class");

		}
	}
}

public class NestedClassesDemo3 {

	public static void main(String[] args) {
		Transportation tr = new Transportation();
		tr.landTransport();
		Transportation.WaterTransport waterTr = new Transportation.WaterTransport();
		waterTr.underWater();
		Transportation.WaterTransport.overWater();
	}
}
