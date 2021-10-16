package assignmentsJNIT.inheritance;
import java.util.Scanner;

class Person1 {
	String name;
	int age;
	String city;
	
	Scanner sc= new Scanner(System.in);

	void getName() {
		System.out.println("Enter the student name");
		name = sc.next();
	}
	void getAge() {
		System.out.println("Enter the student age");
		age = sc.nextInt();
	}
	void getCity() {
		System.out.println("Enter the City name");
		city = sc.next();
	}
}

class Student extends Person1 {
	int rollNo;
	String schoolName;
	
	void getRollNo() {
		System.out.println("Enter the roll number");
		rollNo = sc.nextInt();
	}
	 void getSchoolName() {
		 System.out.println("Enter the school Name");
		 schoolName = sc.next(); 
	 }

	void displayDetails() {
		System.out.println("I am " + name + "my age is " + age + " and I live in " + city);
		System.out.println("My school Name is " + schoolName + " and my rollno. is " + rollNo);
		sc.close();
	}
}

public class InheritanceDemo2 {
	public static void main(String[] args) {
		Student rahul = new Student();
		rahul.getName();
		rahul.getAge();
		rahul.getCity();
		rahul.getRollNo();
		rahul.getSchoolName();
		rahul.displayDetails();
	}

}
