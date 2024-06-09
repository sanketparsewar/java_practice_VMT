package pattern;

public class Counter9 {
	public static void main(String[] args) {
		int n = 5;
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j > 1; j--)
				System.out.print("\t");
			for (int j = i; j <= n; j++) {
				System.out.print(count++ + "\t");
			}
			System.out.println();
		}
	}
}
