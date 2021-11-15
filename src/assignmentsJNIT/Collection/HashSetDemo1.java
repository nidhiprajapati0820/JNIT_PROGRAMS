package assignmentsJNIT.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("T");
		hs.add("S");
		hs.add("J");
		hs.add("C");
		hs.add("P");
		hs.add("L");
		hs.add("D");
		hs.add("U");
		hs.add("K");
		

		System.out.println( hs);

		Iterator itr = hs.iterator();
	
		System.out.println("The iterator values are: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}
}
