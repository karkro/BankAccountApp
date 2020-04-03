package bankAccountApp;

public class Savings extends Account{
	// List properties specific to the Savings account
	int safetyDepositBoxId;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings account
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;  
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	//List any methods specific to the Savings account
	public void showInfo() {
		System.out.println("Type account: Savings");
		super.showInfo();
		System.out.println("Your savings account features: " +
		"\nSafety deposit Box Id: " + safetyDepositBoxId + 
		"\nSafety deposit Box Key: " + safetyDepositBoxKey);
		
	}
	
}
