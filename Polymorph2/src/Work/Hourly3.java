package Work;

public class Hourly3 extends Employee3 {

	private int hoursWorked;
	
	public Hourly3(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		
		super(eName, eAddress, ePhone, socSecNumber, rate);
		hoursWorked = 0;
	}
	
	public void addHours(int moreHours) {
		hoursWorked = hoursWorked + moreHours;
	}
	
	public double pay() {
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		
		return payment;
	}
	
	public int vacation() {
		return STANDARD_VACATION;
	}
	
	public String toString() {
		String result = super.toString();
		result = result + "\nCurrent hours: " + hoursWorked;
		
		return result;
	}
}
