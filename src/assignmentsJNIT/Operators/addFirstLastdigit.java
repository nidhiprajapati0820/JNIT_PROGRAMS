package assignmentsJNIT.Operators;

import java.util.Scanner;

public class addFirstLastdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int sum=0, firstDigit = 0, lastDigit;
		
		lastDigit = n%10;
		
		while (n>9) {
			n=n/10;
			firstDigit= n;
			
		}
		sum = firstDigit + lastDigit;

        System.out.println("Summation of the first and last Digit is:  "+ sum);
	}

}
