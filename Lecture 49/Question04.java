package q11337;
public class BankDemo {
	public static void main(String [] args) {
		CheckingAccount c = new CheckingAccount(1001);
		System.out.println("Depositing $1000...");
		c.deposit(1000.00);
		try {
			System.out.println("Withdrawing $700...");
			c.withdraw(700.00);
			System.out.println("Withdrawing $600...");
			c.withdraw(600.00);
		}
		catch (InsufficientFundsException e) {
			System.out.println("Sorry, short of $" + e.getAmount() + " in the account number " + c.getNumber());
		}
	}
}
class InsufficientFundsException extends Exception {
	private double amount;
	public InsufficientFundsException(double amount) {
		this.amount=amount;
	}
	public double getAmount() {
		return amount;
	}
}
class CheckingAccount {
	private double balance;
	private int accountNumber;
	public CheckingAccount(int number) {
		accountNumber=number;
	}
	public void deposit(double amount) {
		// add amount to balance
		balance+=amount;
	}
	public void withdraw(double amount) throws InsufficientFundsException {
		if(balance>amount) { // if sufficent balance is there
		// deduct the amount from balance
		balance=balance-amount;
		} else {
			throw new InsufficientFundsException(amount-balance); // send insufficient amount 
		}
	}
		public double getBalance() {
			return balance;
					
		}
		public int getNumber() {
			return accountNumber;
		}
	}
