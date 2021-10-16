package assignmentsJNIT.polymorphism;

class Hospital {

	void getHospital() {
		System.out.println("New random hospital found");
	}

	void getHospital(String loc) {
		System.out.println("New hospital near location " + loc + " found");
	}

	void getHospital(String loc, boolean spec) {
		System.out.println("[Speciality1: YES] New speciality hospital near location " + loc + " found");
	}

	void getHospital(boolean spec, String loc) {
		System.out.println("[Speciality2: YES] New speciality hospital near location " + loc + " found");
	}

}

public class PatientM {

	public static void main(String[] args) {
		Hospital apollo = new Hospital();
		apollo.getHospital();
		apollo.getHospital("Phoenix");
		apollo.getHospital("Phoenix", true);
		apollo.getHospital(true, "Phoenix");
	}
}
