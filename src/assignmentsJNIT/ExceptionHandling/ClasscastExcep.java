package assignmentsJNIT.ExceptionHandling;

// Classcast Exception
public class ClasscastExcep {

	public static void main(String[] args) {
		try {

			Object o = new Object();

			// type casting the object o to string which give the classcasted exception
			// because we type cast an parent type to its child type.

			String s = (String) o;

			System.out.println(s);
		} catch (Exception e) {
			System.out.println(e);
		}

		try {

			// creating an object
			String s = "GFG";
			Object o = (Object) s;

			// Object class is parent class of every class Hence exception doesn't occur.
			System.out.println(o);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
