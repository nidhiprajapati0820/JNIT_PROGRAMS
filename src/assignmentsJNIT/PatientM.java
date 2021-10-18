package assignmentsJNIT;

class Hospital{
	void listOfSpecialty(){
		System.out.println("List of speciality available in Hospital\n1 Allergists\n2 Dermotologists\n3 Infections desease\n4 Cardiologist\n5 Gynocologists\n");
	}
	
	void selectSpecialist(String speciality, String name) {
		System.out.println("Choose spacialist and name: "+speciality+", " +name);
		
	}
	
	String checkAvailablty() {
		
		return "Monday and Friend";
	}
	
	String fixAppointment(String day, String time) {
		 return day + "," + time;
	}
	
}

public class PatientM {

	public static void main(String[] args) {
		Hospital apollo= new Hospital();
		apollo.listOfSpecialty();
		apollo.selectSpecialist( "Cardiologist","DrSteef \n");
		System.out.println("Available in week days: " + apollo.checkAvailablty());
		//apollo.checkAvailablty();
        System.out.println("Appointment Day and Time:  "+ apollo.fixAppointment("Monday","2:30"));
	}
	
} 
