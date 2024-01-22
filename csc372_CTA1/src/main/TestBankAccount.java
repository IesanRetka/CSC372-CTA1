package main;

public class TestBankAccount {

	public static void main(String[] args) {
		CheckingAccount account = new CheckingAccount(2.5);
		account.setFirstName("John");
		account.setLastName("Doe");
		account.setAccountID(12345);
		
		account.deposit(500);
		account.withdrawal(550);
		account.displayAccount();
	}
}
