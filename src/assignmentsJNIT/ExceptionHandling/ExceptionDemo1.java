package assignmentsJNIT.ExceptionHandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		try {
			int a[] = new int[10];

			a[11] = 9;
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			System.out.println(" This array is out of range");
		}
	}

}
