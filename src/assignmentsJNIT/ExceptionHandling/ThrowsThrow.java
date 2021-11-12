package assignmentsJNIT.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsThrow {

	public static int calculate(int num) throws ArithmeticException, NullPointerException {
		int a = 0;
		int arr[] = null;
		System.out.println(arr.length);

		a = 100 / num;

		return a;
	}

	public static void main(String[] args) {
		int b = 0;

		try {
			b = calculate(0);

			System.out.println("Im good");

		} catch (Exception e) {
			System.out.println(b);
			// System.out.println("In error");
			e.printStackTrace();
		}

	}
}
