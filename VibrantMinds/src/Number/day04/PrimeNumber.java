package Number.day04;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 169;
		boolean b = false;
		if (n == 0 || n == 1)
			b = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				b = true;
				break;
			}
		}
		if (!b)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is not prime");
	}
}

//WAP to find 131th prime number
//WAP to display first 35 prime number in reverse order
