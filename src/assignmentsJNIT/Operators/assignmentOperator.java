package assignmentsJNIT.Operators;

import java.util.Scanner;

public class assignmentOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		
		int x = input;
		x += 3; // x=x+3, x= 5+3, 8
		System.out.println("x += 3 => x=" + x);

		int y = input;
		y -= 3; // y=y-3, 5
		System.out.println("y -= 3 => y=" + y);

		int z = input;
		z %= 3; // z=z%3, 5%3,2
		System.out.println("z %= 3 => z=" +z);

		int p = input;
		p /= 3; // p=p/3, 5/3,1
		System.out.println("p /= 3 => p=" +p);
	}

}
