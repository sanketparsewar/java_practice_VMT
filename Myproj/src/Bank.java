import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int bal = 0, amt = 0, ch;
		while (true) {
			System.out.println("1.Deposit\n2.Withdraw\n3.Display Balance\n4.Exit\nEnter choice");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter amount to deposit ");
				amt = s.nextInt();
				bal += amt;
				System.out.println("Amount deposited.\n");
				break;

			case 2:
				System.out.println("Enter amount to withdraw ");
				amt = s.nextInt();
				if (bal <= 0) {
					System.out.println("Insufficient balance to withdraw.\n");
					break;
				} else if (amt > bal) {
					System.out.println("Insufficient balance\nEnter less amount.\n ");
					break;
				} else {
					bal -= amt;
					System.out.println("Amount withdrawed.\n");
					break;
				}
			case 3:
				System.out.println("Balance: " + bal + "\n");
				break;
			case 4:
				System.out.println("ThankYou!");
				System.exit(ch);
			default:
				System.out.println("Invalid input!\n");
				break;
			}
		}

	}

}






