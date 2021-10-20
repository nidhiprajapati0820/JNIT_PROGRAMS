package assignmentsJNIT.Interface;

interface Shape {
	void getArea();

	void getPerimeter();
}

abstract class Polygon implements Shape {
	void polygonSide() {
		System.out.println(" Polygon have side ");
	}
}

class Square extends Polygon {
	int side;
	int area;
	int perimeter;

	Square(int side) {
		this.side = side;
	}

	public void getArea() {
		area = side * side;
		System.out.println("Area of the square: " + area);
	}

	public void getPerimeter() {
		perimeter = 4 * side;
		System.out.println("Perimeter of the square: " + perimeter);

	}
}

class Triangle extends Polygon {
	int side;
	double area;
	double perimeter;

	Triangle(int side) {
		this.side = side;
	}

	public void getArea() {
		area = 0.5 * side * side;
		System.out.println("Area of the Triangle: " + area);

	}

	public void getPerimeter() {
		perimeter = 3 * side;
		System.out.println("Perimeter of the Triangle: " + perimeter);
	}
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		Square r = new Square(5);
		r.getArea();
		r.getPerimeter();

		Triangle c = new Triangle(8);
		c.getArea();
		c.getPerimeter();

	}

}
