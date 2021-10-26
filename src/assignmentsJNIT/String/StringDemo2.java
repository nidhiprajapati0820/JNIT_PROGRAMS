package assignmentsJNIT.String;

public class StringDemo2 {

	public static void main(String[] args) {

		// valueOf

		int number = 45;
		float f = 23.44f;
		long l = 1234l;
		double d = 2243.54;
		char ch = 'N';
		char array[] = { 'a', 'b', 'c' };

		String str = String.valueOf(number);
		System.out.println(str + 33);

		String str1 = String.valueOf(f);
		String str2 = String.valueOf(l);
		String str3 = String.valueOf(d);
		String str4 = String.valueOf(ch);
		String str5 = String.valueOf(array);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);

		// equals()Method

		String strr = "Hello Hello";
		String strr1 = "Hi";
		String strr2 = "hello";

		System.out.println(strr.equals(strr2));

		// format() method
		String fstr = String.format("My String is: %1$s and %2$s", strr, strr1);
		System.out.println(fstr);

		// endWith()
		System.out.println("strr ends with String: " + strr.endsWith("Hello"));

		// indexOf()
		System.out.println("Index of O in strr: " + strr.indexOf('o'));

		// length()
		System.out.println("Length of strr:" + strr.length());

		// replace()
		System.out.print("String after replacing all 'i' with 'y' :");
		System.out.println(strr1.replace('i', 'y'));
	}

}
