
public class BuddyInfo {
	private String address;
	private String name;
	private int phoneNumber;

	/**
	 * Initializes instance variables
	 * @param address
	 * @param name
	 * @param phoneNumber
	 */
	public BuddyInfo(String address, String name, int phoneNumber) {
		super();
		this.address = address;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Ottawa", "Aiman", 12345);
		
		System.out.println("Address: " + buddy.getAddress());
		System.out.println("Name: " + buddy.getName());
		System.out.println("Phone Number: " + buddy.getPhoneNumber());
	}
}