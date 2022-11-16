package Work;

public class Employee3 extends StaffMember3 {

	public final int STANDARD_VACATION = 14;
	protected String socialSecurityNumber;
	protected double payRate;

	public Employee3(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		
		super(eName, eAddress, ePhone);
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}
	
	public String toString() {
		
		String result = super.toString();
		result = result + "\nSocial Security Number: " + socialSecurityNumber;
		
		return result;
	}
	
	public double pay() {
		return payRate;
	}
	
	public int vacation() {
		return STANDARD_VACATION;
	}
}
