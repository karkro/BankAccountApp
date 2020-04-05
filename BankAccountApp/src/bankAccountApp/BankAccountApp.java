package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		
		// Read a CSV File then create new accounts based on that data
		String file = "/home/karkro/git/LocalBankAccountApp/BankAccountApp/newBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file );
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, ssn, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, ssn, initDeposit));
			} else {
				System.out.println("Error reading account type");
			}
			
		}
		
		for (Account acc : accounts) {
			System.out.println("\n**************");
			acc.showInfo();
		}
		 
		
		/*
		 * Checking chkacc1 = new Checking("Tomasz Nowak", "123456787", 2300); Savings
		 * saveacc1 = new Savings("Richy Rich", "987645567", 1300);
		 * 
		 * chkacc1.showInfo(); System.out.println("****************");
		 * saveacc1.showInfo();
		 * 
		 * saveacc1.deposit(3000); saveacc1.withdraw(1000); saveacc1.transfer("Kielce",
		 * 2300); saveacc1.compound();
		 */		
		
		
	}	
}
