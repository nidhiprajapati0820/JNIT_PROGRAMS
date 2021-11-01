package BasicPrograms;

public class PalindromeP {

	public static void main(String[] args) {

		int n = 453, m = 0, rev = 0, sum = 0;
		m = n;
		int x = 0;

		for (int i = 3; i > 0; i--) {
			rev = n % 10;
			sum = (sum * 10) + rev;
			n = n / 10;
		}
		System.out.println("rev=" + sum);

		if (m == sum) {
			System.out.println("No is palindrme");
			
		} else {
			System.out.println("No is not palindrme");
		}

	}

}
