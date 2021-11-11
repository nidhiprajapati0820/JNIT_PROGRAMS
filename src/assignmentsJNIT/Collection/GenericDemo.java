package assignmentsJNIT.Collection;

class Sample<X>{
	void show(X a) {
		System.out.println("a="+a);
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		
		Sample<Integer> i= new Sample<Integer>();
		i.show(10);
		
        Sample <Double> d= new Sample<Double>();
        d.show(1.34);
        
        Sample <Float> f= new Sample<Float>();
        f.show(20.0f);
        
        Sample <Character> ch= new Sample<Character>();
        ch.show('c');
        
        
        
     
	}

}
