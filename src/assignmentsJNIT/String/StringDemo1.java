package assignmentsJNIT.String;

public class StringDemo1 {

	public static void main(String[] args) {
		String str = "Welcome to string tutorial";
		String strr = "compareTo method example";
		String strr1 = "Hello";
		String strr2 = "hello";

		// charAt()Method
		char ch1 = str.charAt(1);
		char ch2 = str.charAt(3);

		System.out.println("Charactor of 1st index is: " + ch1 + "and" + "\nCharactor of 3rd index is: " + ch2);
		try {
			char ch3 = str.charAt(-1);
			System.out.println(ch3);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index outside the Range" + e);
		}

		// For Print of all characters of String

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		// To count the occurrence of the character
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 't') {
				counter++;
			}
		}
		System.out.println("char 't' occurred " + counter + "  time in the string ");

		// compareTo()method
		int var1 = str.compareTo(strr);
		System.out.println("str & strr comparison:  " + var1);
		int var2 = strr1.compareToIgnoreCase(strr2);
		System.out.println(strr1.compareTo(strr2));
		System.out.println(strr1.compareToIgnoreCase(strr2));

		// Contains Method
		System.out.println(str.contains("to"));
		System.out.println(str.contains("To"));
		if (str.contains("this")) {
			System.out.println("the word this is found in given string");
		} else {
			System.out.println("the word this is not found in given string");
		}

		// Concat()Method
		strr1 = strr1.concat(" ").concat(str);
		System.out.println(strr1);

		// Substring()method
		System.out.println(strr1.substring(5, 13));

	}

}
