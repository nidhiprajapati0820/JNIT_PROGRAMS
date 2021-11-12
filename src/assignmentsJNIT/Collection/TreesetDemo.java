package assignmentsJNIT.Collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> tset = new TreeSet<String>();

		tset.add("Rahul");
		tset.add("Riya");
		tset.add("Rahul");
		tset.add("John");
		tset.add("Shiva");
		tset.add("Yati");
		tset.add("Akshay");
		tset.add("Bob");

		System.out.println(tset);

		TreeSet<Integer> tset2 = new TreeSet<Integer>();

		tset2.add(88);
		tset2.add(7);
		tset2.add(101);
		tset2.add(0);
		tset2.add(3);
		tset2.add(222);
		System.out.println(tset2);
	}

}
