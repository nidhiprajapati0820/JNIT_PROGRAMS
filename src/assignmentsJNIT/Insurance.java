package assignmentsJNIT;
class InsuranceDetail {
	String responsibleParty;
	short insuranceId;
	int birthday;
	String address;
	long empMobileNo;
	long policyNo;
	boolean isPatientHere;
	char relationToPatient;
	float rate;
	static String companyName = "Aetna";
}

public class Insurance {
	public static void main(String[] args) {
		InsuranceDetail rs = new InsuranceDetail();
		rs.insuranceId = 2233;
		rs.responsibleParty = "XYZ";
		rs.birthday = 20100803;
		rs.address = "23422 16th Street";
		rs.empMobileNo = 9836547829L;
		rs.policyNo = 23454235178765L;
		rs.isPatientHere = true;
		rs.relationToPatient = 'G';
		rs.rate = 2.45f;
		System.out.println("Responsible Party Name: " + rs.responsibleParty);
		System.out.println("Birthday (YYYYMMDD): " + rs.birthday);
		System.out.println("Address: " + rs.address);
		System.out.println("Mobile Number: " + rs.empMobileNo);
		System.out.println("Policy Number: " + rs.policyNo);
		System.out.println("Insurance Company Name: " + InsuranceDetail.companyName);
		System.out.println("Relation to patient: " + rs.relationToPatient);
		System.out.println("Insurance Rate: " + rs.rate);
		System.out.println("Insurance ID: " + rs.insuranceId);
	}

}