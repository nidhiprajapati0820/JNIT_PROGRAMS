package assignmentsJNIT.inheritance;

import java.util.Scanner;

class Person0 {
	String name;
	int age;
}

class Student0 extends Person0 {
	String collegeName;
}

class Leader extends Student0 {
	String department;

	void displayLeader() {
		System.out.println("My name is " + name + "  and I am only  " + age + " years old");
		System.out.println("I am a leader of  " + department + " department ");
		System.out.println("I was a student of  " + collegeName);
	}
}

public class Multilevel_InheritanceDemo1 {

	public static void main(String[] args) {
		Leader rahul = new Leader();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		rahul.name = sc.next();
		System.out.println("Enter your age");
		rahul.age = sc.nextInt();
		System.out.println("Enter your college name");
		rahul.collegeName = sc.next();
		System.out.println("Enter your department");
		rahul.department = sc.next();
		rahul.displayLeader();
	}

}
