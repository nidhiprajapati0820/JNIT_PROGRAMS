package assignmentsJNIT.NestedClasses;

//Nested inner classes
class University {
	void announcement() {
		System.out.println("Exam will start from 1st nov");
		Department cse = new Department();
		cse.prepareQuestions();

	}

	class Department {
		void prepareQuestions() {
			System.out.println("Exam paper will be prepared in ten days");
		}
	}
}

// // Local inner classes
class University1 {
	void announcement() {
		System.out.println("Exam will start from 10st nov");

		class Department {
			void prepareQuestions() {
				System.out.println("Exam paper will be prepared in 15 days");
			}
		}
		Department cse = new Department();
		cse.prepareQuestions();
	}
}

// Static inner class
class University2 {

	static class Department {
		void announcement() {
			System.out.println("Correction will start in ten days");
		}

		static void result() {
			System.out.println("10th nov is result day");
		}
	}
}

public class NestedClassesDemo1 {

	public static void main(String[] args) {
		University texas = new University();
		texas.announcement();
		System.out.println("**************************************");
		University1 arizona = new University1();
		arizona.announcement();
		System.out.println("***************************************");
		University2.Department cse = new University2.Department();
		cse.announcement();
		University2.Department.result();
	}

}
