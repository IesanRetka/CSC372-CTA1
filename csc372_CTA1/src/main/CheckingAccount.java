package main;

public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	public CheckingAccount(double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	@Override
	public void withdrawal(double amount) {
		if (getBalance() < amount) {
			super.withdrawal(amount + 30.0);
			System.out.println("$30 overdraft fee has been charged.");
		} else {
			super.withdrawal(amount);
		}
	}
	public void displayAccount() {
		accountSummary();
		System.out.println("InterestRate: " + interestRate + "%");
	}
}
