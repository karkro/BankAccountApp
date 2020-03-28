package bankAccountApp;

public class Savings extends Account{
	// List properties specific to the Savings account
	int safetyDepositBoxId;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings account
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		// System.out.println("ACCOUNT NUMBER: " + accountNumber);
		// System.out.println("NEW SAVINGS ACCOUNT");
	}
	//List any methods specific to the Savings account
	public void showInfo() {
		System.out.println("Type account: Savings");
		super.showInfo();
	}
	
	
}
