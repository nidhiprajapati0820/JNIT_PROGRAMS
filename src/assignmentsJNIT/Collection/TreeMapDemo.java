package assignmentsJNIT.Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(1023, "Lisa");
		tm.put(1024, "Christopher");
		tm.put(1025, "jhon");
		tm.put(1026, "Devid");
		tm.put(1027, "Michael");
		tm.put(1028, "Robert");

		System.out.println(tm);
		Set<Integer> s = tm.keySet();
		Collection<String> co = tm.values();

		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
 
		Iterator it2 = co.iterator();
		
		while( it2.hasNext()) {
			System.out.println(it2.next());
			
		
		}
	}

}
