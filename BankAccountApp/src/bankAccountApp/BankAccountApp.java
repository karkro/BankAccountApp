package bankAccountApp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Tomasz Nowak", "123456787", 2300);
		Savings saveacc1 = new Savings("Richy Rich", "987645567", 1300);
		
		chkacc1.showInfo();
		System.out.println("****************");
		saveacc1.showInfo();
		
		saveacc1.deposit(3000);
		saveacc1.withdraw(1000);
		saveacc1.transfer("Kielce", 2300);
		saveacc1.compound();
		
		// Read a CSV File then create new accounts based on that data
		
	}	
}
