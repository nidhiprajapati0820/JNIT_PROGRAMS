package assignmentsJNIT.Operators;

import java.util.Scanner;

public class CalGrade {

	public static void main(String[] args) {
		 int sum, avg;
		
		System.out.println("Enter the score of subjects ");
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the score of English: ");
		 int eng = sc.nextInt();
		 System.out.println("Enter the score of Math: ");
		 int math = sc.nextInt();
		 System.out.println("Enter the score of physics: ");
		 int phy = sc.nextInt();
		 System.out.println("Enter the score of Chemistry: ");
		 int chem = sc.nextInt();
		 System.out.println("Enter the score of Hindi: ");
		 int hindi = sc.nextInt();
		 System.out.println("Enter the score of Telugu: ");
		 int telugu = sc.nextInt();
		 
		  sum = eng + math + phy + chem + hindi + telugu;
		  
		  avg = sum/6;
		  
		if(avg>=75) {
			System.out.println(" Excellent: Grade A");
		}
		else if (avg<75 && avg>= 60) {
			System.out.println("Very Good: Grade B");
		}
		else if (avg<60 && avg>=45) {
			System.out.println("Good: Grade C");
		}
		else if (avg<45 && avg>=33){
			System.out.println("Improvement: Grade D");
		}
		else {
				System.out.println("Failed!");
				}
		 
	}

}
