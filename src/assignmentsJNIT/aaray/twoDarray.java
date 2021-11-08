package assignmentsJNIT.aaray;

public class twoDarray {

	public static void main(String[] args) {
		
      int a [][] = {{10,20,30}, {40,50,60}, {70,80,90}};
      
      for(int i=0; i<a.length; i++) {
    	  
    	  for(int j=0; j<3; j++) {
    		  
    		  System.out.println("["+i+"]["+j+"]"+"="+ a[i][j]);
    	  }
    	
      }

	}

}
