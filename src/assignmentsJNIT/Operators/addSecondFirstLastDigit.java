package assignmentsJNIT.Operators;

import java.util.Scanner;

public class addSecondFirstLastDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();

		int sum = 0, firstSDigit = 0, lastSDigit = 0;

		lastSDigit = n % 100;
		lastSDigit = lastSDigit / 10;
		System.out.println(lastSDigit);

		while (n > 99) {
			n = n / 10;
			firstSDigit = n;
		}

		firstSDigit = firstSDigit % 10;
		System.out.println(firstSDigit);
		sum = firstSDigit + lastSDigit;

		System.out.println("Summation of first second : " + sum);

	}

}
