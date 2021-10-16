package assignmentsJNIT;
class PatientDetail {
	String fullname;
	boolean isLegalName;
	short age;
	char sex;
	long ssn;
	static String hospitalName = "Apolo";
	float bill;
}

public class Patient {
	public static void main(String[] args) {
		PatientDetail shiva = new PatientDetail();
		shiva.fullname = "Ravi Sharma";
		shiva.isLegalName = true;
		shiva.age = 65;
		shiva.sex = 'M';
		shiva.ssn = 9999999999L;
		shiva.bill = 37643.65f;
		System.out.println("Full Name " + shiva.fullname);
		System.out.println("Is the name legal?  " + shiva.isLegalName);
		System.out.println("Age " + shiva.age);
		System.out.println("sex " + shiva.sex);
		System.out.println("SSN " + shiva.ssn);
		System.out.println("Hospital Name  " + PatientDetail.hospitalName);
		System.out.println("Total Bill  " + shiva.bill);
	}
}
