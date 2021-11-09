package assignmentsJNIT.ExceptionHandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("56fj");

			System.out.println(num);

		} catch (NumberFormatException nf) {
			
			System.out.println("I got the error");
			nf.printStackTrace();

		}

	}

}
