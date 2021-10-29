package assignmentsJNIT.Operators;

public class WhileDemo2 {

	public static void main(String[] args) {
		int sum = 0, n = 1;
		int t = 1;
		while (n <= 5) {
			t = t * 2;
			System.out.println("2^" + n + " => " + t);
			sum= sum+t;
			n++;
		}
		System.out.println(sum);
	}



}
