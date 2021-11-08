package BasicPrograms;

public class PrimeNo {

	public static void main(String[] args) {
		int n = 11, i = 1, count = 0;

		do {

			if (n % i == 0) {
				count++;
			}
			i++;

		} while (i <= n);

		
		if (count == 2) {

			System.out.println("its a Prime No.");
		} else {
			System.out.println("its not a prime No.");
		}
		// }

	}
}

/*
 * while(i<=n) {
 * 
 * if(n%i == 0) { count++; } i++;
 * 
 * } if(count==2) {
 * 
 * System.out.println("its a Prime No."); }else {
 * System.out.println("its not a prime No."); } }
 * 
 * }
 */