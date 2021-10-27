package assignmentsJNIT.Operators;

public class SwitchStatement {

	public static void main(String[] args) {
		
		  char choice = 'A';
		String mobile = "iPhone";

		switch (choice) {
		case 'A':
			System.out.println("Case1 ");
			break;
		case 'B':
			System.out.println("Case2 ");
			break;
		case 'C':
			System.out.println("Case3 ");
			break;
		case 'D':
			System.out.println("Case4 ");
			break;
		default:
			System.out.println("Default ");
		}
		
		switch (mobile) {
		case "samsung":
			System.out.println("Buy a Samsung phone");
			break;

		case "iPhone":
			System.out.println("Buy an iPhone");
			break;

		case "Motorola":
			System.out.println("Buy a Motorola phone");
		}

	}
}
