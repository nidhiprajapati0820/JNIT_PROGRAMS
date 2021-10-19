package assignmentsJNIT.thisSuper;

class Person{
	String name;
	
	Person(String name){
		this.name = name; 
		}
}

class Emp extends Person {
	float salary;
	
	Emp(String name, float salary){
		super(name);
		this.salary = salary;
	}
	
	void display() {
		System.out.println(name + " " +salary);
	}
	
}

public class SuperthisDemo {

	public static void main(String[] args) {
		Emp e1 =  new Emp("Vikram", 45000f);
		e1.display();
		

	}

}
