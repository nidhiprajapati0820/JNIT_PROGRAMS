package assignmentsJNIT;

class Patients {
	double patient_id;
	long mobileNo;
	String DoB;

	Patients() {
		patient_id = 3425;
		mobileNo = 983452618L;
		DoB = "19850323";
	}

	Patients(double x, long y, String z) {
		patient_id = x;
		mobileNo = y;
		DoB = z;
	}

	void display() {
		System.out.println("\nPatient Id: " + patient_id + "\nMobile No.: " + mobileNo + ",\nDOB(YYYYMMDD): " + DoB);
	}

}

public class Hospitals {

	public static void main(String[] args) {
		Patients p1 = new Patients();
		Patients p2 = new Patients(567, 9826457893L, "1983/09/08" );
		p1.display();
		p2.display();

	}

}
