package BasicPrograms;

public class PrimeNo {

	public static void main(String[] args) {
	 int n=9, i=1, count = 0;
	 
	 while(i<=n) {
		 
		 if(n%i == 0) {
		 count++;
		 }
		 i++;
		 
	 }
      if(count==2) {
    	  
    	  System.out.println("its a Prime No.");
      }else {
    	  System.out.println("its not a prime No.");
      }
	}

}



/*	 
	  while(i<=n) {
		 
		 if(n%i == 0) {
		 count++;
		 }
		 i++;
		 
	 }
      if(count==2) {
    	  
    	  System.out.println("its a Prime No.");
      }else {
    	  System.out.println("its not a prime No.");
      }
	}

}
 */