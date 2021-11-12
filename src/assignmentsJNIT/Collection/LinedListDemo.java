package assignmentsJNIT.Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinedListDemo {

	public static void main(String[] args) {
		LinkedList <Integer> li = new LinkedList<>();
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
		li.add(2, 10);
        System.out.println(li);	
        li.addAll(al);
        System.out.println(li);
        li.addAll(3, al);
        System.out.println(li);
        System.out.println(al.clone());
        System.out.println(li.contains(al));
        System.out.println(li.getLast());
        System.out.println(li.poll());
        li.set(3, 15);
        System.out.println(li);
        
		
		

	}

}
