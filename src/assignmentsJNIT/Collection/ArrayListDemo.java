package assignmentsJNIT.Collection;

import java.util.*;

public class ArrayListDemo {

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
         al.add(4, "Briana");   // add Briana at 4th position
         System.out.println( al);
         al.remove(1);  //
         System.out.println(al);
         al.remove("Robert");
         System.out.println(al);
         al.set(1, "Robert");
         System.out.println(al);
         System.out.println(al.indexOf("William"));
         String al2= al.get(3);
         System.out.println(al2);
         System.out.println(al.size());
         System.out.println(al.contains("Briana"));
        System.out.println(al.get(4));
         
         //for(String x: al) {
        	 //System.out.println(x);
        // }
	}

}
