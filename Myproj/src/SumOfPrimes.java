
public class SumOfPrimes {

	public static void main(String[] args) {
		int n = 100;
		int sum = 0;
		for (int a = 2; a <= n; a++) {
			if (prime(a) == 0) {
				continue;
			} else {
				System.out.print(" " + prime(a));
				sum = sum + prime(a);
			}
		}
		System.out.println("\nSum of all Primes between 2 to " + n + " (including both) is= " + sum);
	}

	static int prime(int i) {
		int val = 0;
		for (int j = 1; j <= i; j++) {
			if (j == i) {
				val = i;
				break;
			} else if (j != 1 && i % j == 0) {
				val = 0;
				break;
			}
		}
		return val;

	}
}
