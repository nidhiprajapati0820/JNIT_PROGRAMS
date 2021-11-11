package assignmentsJNIT.Collection;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int a = 20;
		// Integer intobj= new Integer (a); //Auto-boxing
		Integer intobj = a;
		byte b = 1;
		Byte byteobj = new Byte(b);

		float c = 10;
		Float floatobj = new Float(c);

		double d = 4.36;
		Double doubleobj = new Double(d);

		char e = 'a';
		Character charobj = e;

		System.out.println("Value of wrapper objects");
		System.out.println("Integer object intobj:" + intobj);
		System.out.println("Byte object byteobj: " + byteobj);
		System.out.println("Float object floatobj: " + floatobj);
		System.out.println("Double object doubleobj: " + doubleobj);

		byte bv = byteobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;

		System.out.println("\nUnwrapped values (printing as data types)");
		System.out.println("byte value, bv: " + bv);
		System.out.println("int value, iv: " + iv);
		System.out.println("float value, fv: " + fv);
		System.out.println("double value, dv: " + dv);
		System.out.println("char value, cv: " + cv);

	}
}