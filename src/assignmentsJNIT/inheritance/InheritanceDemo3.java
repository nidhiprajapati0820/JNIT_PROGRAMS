package assignmentsJNIT.inheritance;

import java.util.Scanner;

class Vehicle {
	String make;
	String color;
	int year;
	String model;
	Scanner sc = new Scanner(System.in);

	void getName() {
		System.out.println("Manufaturer");
		make = sc.next();
	}

	void getColor() {
		System.out.println("Color");
		color = sc.next();
	}

	void getYear() {
		System.out.println("Year");
		year = sc.nextInt();
	}

	void getModel() {
		System.out.println("Model");
		model = sc.next();
	}

}

class Car extends Vehicle {
	String bodyStyle;

	void getBodyStyle() {
		System.out.println("Body Style");
		bodyStyle = sc.next();
	}

	void CarDetail() {
		System.out.println("Manufacturer company " + make + " Color " + color + " Year " + year + " Model " + model);
		System.out.println("Body Style " + bodyStyle);
	}
}

public class InheritanceDemo3 {

	public static void main(String[] args) {
		Car corolla = new Car();
		corolla.getName();
		corolla.getColor();
		corolla.getYear();
		corolla.getModel();
		corolla.getBodyStyle();
		corolla.CarDetail();

	}

}
