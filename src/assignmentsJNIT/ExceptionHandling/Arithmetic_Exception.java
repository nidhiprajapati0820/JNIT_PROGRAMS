package assignmentsJNIT.ExceptionHandling;

import java.util.Scanner;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		int a, b, c;
		int arr[] = new int[3];
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value");
			b= sc.nextInt();
			a = 65 / b;
			System.out.println(a);
			System.out.println("Hey I'm at the end of try block");
			c= arr[4];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of range");
		}

		catch (ArithmeticException e) {

			System.out.println("You should not divide a number by zero");

		}
		
		finally {
			System.out.println("I always get executed ");
		}

	}

}
