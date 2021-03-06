package bankAccountApp;

public class Checking extends Account{
	// List properties specific to the Checking account
	private long debitCardNumber;
	private int debitCardPin;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	// List any methods specific to the Checking account
	public void showInfo() {
		System.out.println("Type account: Checking");
		super.showInfo();
		System.out.println("Your checking account features: " + 
		"\nCard: " + debitCardNumber + 
		"\nPin: " + debitCardPin);
	}
}