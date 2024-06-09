package pattern;

public class Counter1 {
	public static void main(String[] args) {
		int n = 5;
		int counter1 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(counter1++ + "\t");
			System.out.println();

		}
		System.out.println();
		int counter2 = (n * (n + 1)) / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(counter2-- + "\t");
			System.out.println();
		}
	}
}
