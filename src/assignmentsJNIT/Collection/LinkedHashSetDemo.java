package assignmentsJNIT.Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

		lhset.add("T");
		lhset.add("YY");
		lhset.add("SS");
		lhset.add("T");
		lhset.add(" ");
		lhset.add("PP");
		lhset.add("N");
		lhset.add("P");
		lhset.add("V");
		System.out.println(lhset);

		LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

		lhset2.add(9);
		lhset2.add(82);
		lhset2.add(0);
		lhset2.add(77);
		lhset2.add(89);
		lhset2.add(96);
		System.out.println(lhset2);

	}

}
