package assignmentsJNIT.ExceptionHandling;

import java.io.*;

public class NullPointerExcep {

	public static void main(String[] args) {

		String ptr = null;
		String np = "gfg";

		try {
			// This line of code throws NullPointerException

			if (ptr.equals(np))
				System.out.print("Same");
			else
				System.out.println("Not Same");

		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught here");
		}

		try

		{
			if ("gfg".equals(np))
				System.out.print("\nSame");
			else
				System.out.print("Not Same");
		} catch (NullPointerException e) {
			System.out.print("Caught NullPointerException");
		}

	}

}
