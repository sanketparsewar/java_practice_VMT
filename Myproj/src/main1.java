class Account {
	int accountNo;
	String accountType;
	int accountBalance;

	void setAccountDetails(int accountNo, String accountType) {
		this.accountNo = accountNo;
		this.accountType = accountType;

	}

	void withdraw(int amount) {
		if (accountBalance < amount) {
			System.out.println("Insufficient Balance!");
		} else {

			accountBalance -= amount;
			System.out.println("Amount withdraw successfull.");
		}

	}

	void deposit(int amount) {
		accountBalance += amount;
		System.out.println("Deposit Successfull.");
	}

	void dispAccountDetails() {
		System.out.println("Account Number = " + accountNo);
		System.out.println("Account Type = " + accountType);
		System.out.println("Balance = " + accountBalance + " Rs");
	}
}

public class main1 {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccountDetails(883039, "Saving");
		ac.dispAccountDetails();
		ac.deposit(15);
		ac.dispAccountDetails();
		ac.withdraw(10);
		ac.dispAccountDetails();

	}

}
