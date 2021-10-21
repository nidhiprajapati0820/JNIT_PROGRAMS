package assignmentsJNIT.NestedClasses;

class Library {

	void display() {
		System.out.println("This is the library of Arizona university ");

		class Technology {

			void branch() {
				System.out.println("This is the section of engg. students for all branches");
			}
		}

		Technology br = new Technology();
		br.branch();

		Fiction f = new Fiction();
		f.horror();
		f.sciencefiction();

	}

	class Fiction {
		void horror() {
			System.out.println("\nThis section is not for kids");
		}

		void sciencefiction() {
			System.out.println("This section is for curious people ");
		}
	}

	static class Nonfiction {
		void biography() {
			System.out.println("This section cover biography of scientists  ");
		}

		static void cuisine() {
			System.out.println("This section cover indian cuisine");

		}
	}
}

public class NestedClassesDemo2 {

	public static void main(String[] args) {
		Library ph = new Library();
		ph.display();
		System.out.println("\n****Static inner class**** ");
		Library.Nonfiction non = new Library.Nonfiction();
		non.biography();
		Library.Nonfiction.cuisine();

	}

}
