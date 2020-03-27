package bankAccountApp;

public class Savings extends Account{
	// List properties specific to the Savings account
	int safetyDepositBoxId;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings account
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		System.out.println("NEW SAVINGS ACCOUNT");
	}
	//List any methods specific to the Savings account
	
	
}
