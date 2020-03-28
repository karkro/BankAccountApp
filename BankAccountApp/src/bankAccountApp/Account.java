package bankAccountApp;

public abstract class Account implements IBaseRate{
	// List common properties for saving and checking accounts
	String name;
	String ssn;
	double balance;
	
	String accountNumber;
	double rate;
	
	static int index = 10000;
		
	// Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
				
		// Set account number		
		index++;
		this.accountNumber = setAccountNumber();
		
	}
	
	private String setAccountNumber() {
		String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
		
	// List common methods
	public void showInfo() {
		System.out.println("Name: " + name + 
				"\nAccount number: " + accountNumber + 
				"\nBalance: " + balance);
	}
	
	
}
	
	
	
	
