package Number.day04;

public class StrongNumber {
	public static void main(String[] args) {
		int n = 145;
		for(int j=1;j<=n;j++) {
		int sum = 0, temp = j;
		while (temp != 0) {
			int fact = 1;
			for (int i = temp % 10; i >= 1; i--) {
				fact *= i;
			}
			sum += fact;
			temp /= 10;
		}
		if (n == sum)
			System.out.println(n + " is a strong number ");
	}
}}
