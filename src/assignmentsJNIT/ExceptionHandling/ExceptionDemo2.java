package assignmentsJNIT.ExceptionHandling;

// Number format Exception

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("5645");

			System.out.println(num);

		} catch (NumberFormatException nf) {
			
			System.out.println("I got the error");
			nf.printStackTrace();

		}

	}

}
