package assignmentsJNIT.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("Welcome");
		set.add("To");
		set.add("Java");
		set.add("Class");
		set.add("JNIT");

		System.out.println("Set: " + set);

		Iterator itr = set.iterator();
	
		System.out.println("The iterator values are: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
