package assignmentsJNIT.Operators;

import java.util.Scanner;

public class WhileDemo1 {

	public static void main(String[] args) {
		int i = 1, multip = 1, n = 1, sum = 0, rem = 0, x = 0, y = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x ");
		x = sc.nextInt();
		while (i <= 10) {
			multip = i * x;
			System.out.println(x + "*" + i + "=" + multip);
			i++;
		}
		System.out.println("**********************");
		
		Scanner f = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		n = sc.nextInt();
		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}

		System.out.println("Sum of the no.is= " + sum);
	}

}
