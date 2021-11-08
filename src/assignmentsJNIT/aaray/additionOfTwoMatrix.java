package assignmentsJNIT.aaray;

public class additionOfTwoMatrix {

	public static void main(String[] args) {
		int [][]a = {{3,4,2},
				     {6,8,7},
				     {5,4,1}};
		int [][]b = {{ 22,43,33},
				      {45,32,12},
				      {66,55,44 }};
		
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(a[i][j]+ b[i][j]);
			}
			System.out.println();
		}

	}

}
