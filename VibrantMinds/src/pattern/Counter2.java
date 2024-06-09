package pattern;

public class Counter2 {
	public static void main(String[] args) {
		int n = 5;
		int counter = 1;
		for (int i = 1; i <= n; i++) {
			int c = counter;
			for (int j = i; j >= 1; j--) {
				System.out.print(c + "\t");
				c--;
			}
			System.out.println();
			counter += i + 1;
		}
	}
}
