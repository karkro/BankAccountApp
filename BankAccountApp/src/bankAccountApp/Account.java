package bankAccountApp;

public abstract class Account implements IBaseRate{
	// List common properties for saving and checking accounts
	private String name;
	private String ssn;
	private double balance;
	
	protected String accountNumber;
	protected double rate;
	
	private static int index = 10000;
		
	// Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
				
		// Set account number		
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		// Narosłe odsetki
		double accruedInterest = balance * (rate/100);
		balance += accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
		
	// List common methods - transactions
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is $" + balance);
	}
	
	public void showInfo() {
		System.out.println("Name: " + name + 
				"\nAccount number: " + accountNumber + 
				"\nBalance: " + balance +
				"\nRate: " + rate + "%");
	}
	
}