package assignmentsJNIT.Collection;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		ArrayList<Integer> al = new ArrayList<>();

		li.add(5);
		li.add(25);
		li.add(35);
		li.add(45);
		li.add(null);
		li.add(25);

		al.add(7);
		al.add(21);
		al.add(35);

		System.out.println(li);
		li.addFirst(3);
		li.addLast(9);
		System.out.println(li);
		li.add(2, 10);            // at index 2 add 10
		System.out.println(li);
		li.addAll(al);           // add al all with li
		System.out.println(li);
		li.addAll(3, al);         // at index 3 add all elements with li
		System.out.println(li);
		System.out.println(al.clone());// copy of la
		System.out.println(li.contains(al)); // false
		System.out.println(li.getLast());
		System.out.println(li.poll()); // retrieves and remove the first element
		System.out.println(li.pollFirst()); 
		System.out.println(li.peek());// retrives and dosen't remove from list
		System.out.println(li);

		ListIterator<Integer> it = li.listIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------------------------------");
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}

	}

}
