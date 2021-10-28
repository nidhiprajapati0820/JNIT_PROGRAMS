package assignmentsJNIT.Operators;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of a = ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b = ");
		int b = sc.nextInt();
		System.out.println("Enter the value of c = ");
		int c = sc.nextInt();
		int x = 2;
		int y = 10;

		System.out.println("a++= "+ a++); 
		System.out.println("++a= "+ ++a); 
		System.out.println("a--= "+ a--); 
		System.out.println("--a ="+ --a); 
		System.out.println("Add (a++ & ++a) "+ a++ + ++a); 
		System.out.println( "Add(b++ & b++)"+ b++ + b++);
		System.out.println( " value of a is = "+ a);
		 
		if(!(x > y)) {
			System.out.println( x +" is not greater than " + y  );
			
		} else {
			System.out.println(x +" is greater than " + y );
		}
		
		System.out.println(13 % 2); // Remainder operator
		System.out.println(13 / 2); // Quotient operator
		
		
		//simple ternary
		int no1 = 23; int no2 = 44; int rr; int t;
		
		if(no1<no2) {
			rr = 200; 
		}else {
			rr =2000;
		}
		
		
		//rr=(no1<no2)?200:2000;
		
		System.out.println("The value rr is "+ rr);
		

		//complex Ternary operator
		int p = 80, q = 20, r, xx = 900, yy = 200;

		if (p > q) {
			if (xx > yy) {
				r = 900;
			} else {
				r = 1000;
			}
		} else {
			r = -1;
		}

		// r = (p > q) ? ((xx > yy) ? 900 : 100 ) : -1;

		System.out.println(r);
		
		t = (xx < yy)? 300: 20;
		System.out.println("t= "+t);

	}

}
