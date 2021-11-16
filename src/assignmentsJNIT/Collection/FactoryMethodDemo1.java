package assignmentsJNIT.Collection;



abstract class Technology {
	abstract void web();

	abstract void developer();

	void editor() {
		System.out.println("Developer can use Eclipse for development");
	}
}

class React extends Technology {
	void web() {
		System.out.println("React is a web technology");
	}

	void developer() {
		System.out.println("React is developed by Facebook");
	}
}

class Java extends Technology {
	void web() {
		System.out.println("\nJava is a not a web technology");
	}

	void developer() {
		System.out.println("Java is developed by Oracle");
	}
}

class TechnologyFactory{
	
	Technology getTechObject(String TechName) {
		if(TechName.equals("React"))
			return new React();
		else if(TechName.equals("Java"))
		    return new Java();
		else return(null);
		
	}
	
} 


public class FactoryMethodDemo1 {

	public static void main(String[] args) {
		TechnologyFactory tf = new TechnologyFactory();
		
		Technology t = tf.getTechObject("React");
		t.web();
		t.developer();
        t.editor();
        
        t = tf.getTechObject("Java");
        t.web();
		t.developer();
        t.editor();
	}

}
