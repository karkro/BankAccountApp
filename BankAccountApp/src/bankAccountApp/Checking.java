package bankAccountApp;

public class Checking extends Account{
	// List properties specific to the Checking account
	int debitCardNumber;
	int debitCardPin;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		// System.out.println("ACCOUNT NUMBER: " + accountNumber);
		// System.out.println("NEW CHECKING ACCOUNT");
	}
	
	// List any methods specific to the Checking account
	public void showInfo() {
		System.out.println("Type account: Checking");
		super.showInfo();
	}
}
