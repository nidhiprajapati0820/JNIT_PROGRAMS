package assignmentsJNIT.Operators;

import java.util.Scanner;

public class ifElseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int i= sc.nextInt();
		String home = "My beautiful family";
		
		if (i==4) {
			i++;
		}else {
			System.out.println(home);
		}
		System.out.println(i);

	}

}
