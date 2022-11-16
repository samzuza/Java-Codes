package Work;

abstract public class StaffMember3 {
	
	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember3(String eName, String eAddress, String ePhone) {
		
		name = eName;
		address = eAddress;
		phone = ePhone;
	}
	
	public String toString() {
		
		String result = "Name: " + name + "\n";
		result = result + "Address: " + address + "\n";
		result = result + "Phone: " + phone + "\n";
		
		return result;
	}
	
	public abstract double pay();
	public abstract int vacation();
	
}
