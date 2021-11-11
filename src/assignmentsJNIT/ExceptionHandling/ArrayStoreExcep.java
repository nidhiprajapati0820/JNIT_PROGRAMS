package assignmentsJNIT.ExceptionHandling;

//   ArrayStoreException 

public class ArrayStoreExcep {

	public static void main(String[] args) {
		
		try {
			Object [] num = new Double[3];
			 Number[] a = new Double[2];
			 
			 a[0] = 5;
		} catch (ArrayStoreException e)	 {
			e.printStackTrace();
		}

	}

}
