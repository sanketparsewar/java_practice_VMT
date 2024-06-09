import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number and get Checked for prime ");
		int n = s.nextInt();
		if (n == 1) {
			System.out.println("Number " + n + " is Co-prime");
			System.exit(0);
		}
		for (int i = 1; i <= n; i++) {
			if (i != 1 && i != n) {
				if (n % i == 0) {
					System.out.println("Number " + n + " is not prime");
					break;
				}
			} else if (n == i) {
				System.out.println("Number " + n + " is prime");
				break;
			}

		}

	}

}
