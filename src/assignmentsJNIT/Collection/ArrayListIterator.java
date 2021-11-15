package assignmentsJNIT.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("James");
		al.add("Michael");
		al.add("David");
		al.add("William");
		al.add("Robert");
		al.add("James");
		al.add("Thomas");
		al.add("Michael");
		al.add("Christopher");
		al.add("Donald");

		System.out.println(al);

		System.out.println("/n----for Each------");

		for (String alf : al) {
			System.out.println(alf);
		}

		System.out.println("/n----Iterator------");

		Iterator<String> it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\n----ListIterator------");
		ListIterator<String> li = al.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("----Reverse the list------");

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		System.out.println("------Spliterator------");

		Spliterator<String> secondhalf = al.spliterator();
		Spliterator<String> firsthalf = secondhalf.trySplit();

		System.out.println("estimate size : " + secondhalf.estimateSize()); // estimateSize method
		System.out.println(secondhalf.getExactSizeIfKnown()); // getExactSizeIfKnown method

		System.out.println(secondhalf.hasCharacteristics(secondhalf.characteristics()));

		System.out.println("------------------------");
		secondhalf.forEachRemaining(System.out::println);
		System.out.println("\n Other half of the Spliterator");
		firsthalf.forEachRemaining(System.out::println);

	

	}

}
