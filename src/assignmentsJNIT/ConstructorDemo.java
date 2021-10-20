package assignmentsJNIT;

class Employees {
	int employee_id;
	double employee_salary;

	Employees() {
		employee_id = 1023;
		employee_salary = 65000;
	}

	Employees(int x, double y) {
		employee_id = x;
		employee_salary = y;
	}

	void display() {
		System.out.println("Employee id= " + employee_id);
		System.out.println("Employee Salary= " + employee_salary);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {

		Employees jone = new Employees();
		Employees bob = new Employees(2345, 75000);
		Employees jone1 = new Employees(4563, 87333);
		jone.display();
		bob.display();
		jone1.display();

	}

}
