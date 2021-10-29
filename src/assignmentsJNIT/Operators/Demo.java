package assignmentsJNIT.Operators;

public class Demo {

	public static void main(String[] args) {

		int n = 456373, sum = 0, ld, fd, sld;
		ld = n % 100; // 73

		sld = ld / 10; // Q=7

		while (n > 99) {

			n = n / 10; // Q=45

		}

		n = n % 10;

		sum = sld + n;

		System.out.println(sum);

	}

}
