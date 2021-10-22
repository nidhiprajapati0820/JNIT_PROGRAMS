package assignmentsJNIT.Operators;

import java.util.Scanner;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int x = sc.nextInt();

		System.out.println("Enter the second number: ");
		int y = sc.nextInt();

		if (x == y) {
			System.out.println("CASE-1: " + x + " equals to " + y);
		} else {
			System.out.println("CASE-2: " + x + " not equals to " + y);
		}

		if (x > y) {
			System.out.println("CASE-3: " + x + " is greater than " + y);
		} else {
			System.out.println("CASE-4: " + x + " is not greater than " + y);
		}

		if (x >= y) {
			System.out.println("CASE-5: " + x + " is greater than or equals to " + y);
		} else {
			System.out.println("CASE-6: " + x + " is not greater than nor equals to " + y);
		}

		if (x > 3) {
			System.out.println("CASE-7: " + x + " is greater than 3");
			if (x < 10) {
				System.out.println("CASE-8: " + x + " is greater than 3 and " + x + " is also less than 10");
			}
		} else { // !(x > 3 && x < 10)
			System.out.println("CASE-9: " + "Neither " + x + " is greater than 3 nor " + x + " is less than 10");
		}

		if (x > 3 || x < 10) {
			System.out.println("CASE-10: " + "Either " + x + " is greater than 3 or " + x + " is less than 10");
		}

		sc.close();

	}

}
