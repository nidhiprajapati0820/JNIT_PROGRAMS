package assignmentsJNIT.aaray;

public class singleDarrayDemo {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		String [] str = {"one", "two","three","four"};
		
		System.out.println("One dimensional array elements are : \n");
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+ "]:"+ a[i]);
		}
		
		for(int i=0; i<str.length; i++) {
			System.out.println("str["+i+"]"+":"+str[i]);
		}

	}

}
