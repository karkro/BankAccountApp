package bankAccountApp;

public abstract class Account implements IBaseRate{
	// List common properties for saving and checking accounts
	String name;
	String ssn;
	double balance;
	
	String accountNumber;
	double rate;
	
	
	
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		System.out.println("Name: " + name + ", SSN: " + ssn + ", Balance: $" + balance);
	}
	
	// List common methods
	
	
	
}
