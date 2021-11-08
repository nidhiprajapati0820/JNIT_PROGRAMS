package assignmentsJNIT.aaray;

public class ThreeD_array {

	public static void main(String[] args) {
		int [][][]a = {{{2,3,4},{6,7,5}}, {{2,51,47},{26,57,58}}, {{12,53,47},{46,72,51}}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<2; j++) {
				for(int k=0; k<3; k++) {
					System.out.println(a[i][j][k]);
				}
				System.out.println();
			}
			
		}
		
	}

}
