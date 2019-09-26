import java.awt.List;
import java.util.LinkedList;

public class AddressBook extends BuddyInfo{
	private LinkedList<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		super(null, null, 0);
		buddyInfo = new LinkedList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddy) {
		if(buddy != null) {
			buddyInfo.add(buddy);
		}
	}
	
	public void removeBuddy(int buddyIndex) {
		if(buddyIndex >= 0 && buddyIndex < buddyInfo.size()) {
			buddyInfo.remove(buddyIndex);
		}
	}
	
	public BuddyInfo getBuddy(int index) {
		return buddyInfo.get(index);
	}
	
	public static void main(String args[]) { 		
		BuddyInfo buddy = new BuddyInfo("Toronto", "Md Aiman Sharif", 123456);
		AddressBook book = new AddressBook();
		book.addBuddy(buddy);
		book.removeBuddy(0);
		
		//NEW LINE ADDED FOR GITHUB
//		System.out.println(book.getBuddy(0).getAddress());
//		System.out.println(book.getBuddy(0).getName());
//		System.out.println(book.getBuddy(0).getPhoneNumber());
	}
	
}
