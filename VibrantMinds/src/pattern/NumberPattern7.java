package pattern;

public class NumberPattern7 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
		System.out.println();
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--)
				System.out.print(j);
			System.out.println();
		}
	}
}
