class Accounts {
	int accountNo;
	String accountType;
	int accountBalance;
	
	Accounts(int accountNo,String accountType,int accountBalance){
		this.accountNo=accountNo;
		this.accountType=accountType;
	}
	
	void withdraw(int amount) {
		accountBalance-=amount;
		System.out.println("Amount withdraw successful.");
	}
	
	void deposit(int amount) {
		accountBalance+=amount;
		System.out.println("Amount deposit successful.");
	}
	
	void dispAccountDetails() {
		System.out.println("Account No. = "+ accountNo);
		System.out.println("AccountType = "+accountType);
		System.out.println("Account Balance = "+accountBalance);
}
}
public class ConstructorMain1 {

	public static void main(String[] args) {
		Accounts a1 = new Accounts(01,"Saving",0);
		a1.dispAccountDetails();
		a1.deposit(20);
		a1.dispAccountDetails();
		Accounts a2 = new Accounts(02,"Current",0);
		a2.dispAccountDetails();
		a2.deposit(15);
		a2.dispAccountDetails();
		

	}

}
