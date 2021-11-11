package assignmentsJNIT.Collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		 
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("fig");
		hset.add("Apple");
		hset.add(null);
		System.out.println(hset);
		
		HashSet<Integer> hset2 = new HashSet<Integer>();
		  
		hset2.add(44);
		hset2.add(77);
		hset2.add(36);
		hset2.add(44);
		hset2.add(null);
		hset2.add(66);
		hset2.add(88);
		hset2.add(33);
		
		System.out.println(hset2);
		

	}

}
