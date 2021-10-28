package assignmentsJNIT.Operators;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		int n = 1;
		int fact = 1;

		while (i <= 5) {
			System.out.println(i);
            sum = sum + i;
			i++;
		}
		System.out.println("Sum: " + sum);
		System.out.println("**************************");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value  ");
		n= sc.nextInt();
		
		while (n>=1) {
			fact= fact*n;
			n--;
		}
       System.out.println("Factorial of number:  "+ fact);
	}

}
