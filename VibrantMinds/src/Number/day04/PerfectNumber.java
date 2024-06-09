package Number.day04;

public class PerfectNumber {
	public static void main(String[] args) {
		int n = 20000;
		for (int j = 1; j <= n; j++) {
			int sum = 0;
			for (int i = 1; i <= j / 2; i++) {
				if (j % i == 0)
					sum += i;
			}
			if (sum == j)
				System.out.println(j + " is a perfect Number");
		}
	}
}
